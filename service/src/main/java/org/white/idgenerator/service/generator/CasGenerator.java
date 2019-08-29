package org.white.idgenerator.service.generator;

import org.springframework.stereotype.Service;
import org.white.idgenerator.service.config.GenerateProperties;
import org.white.idgenerator.service.entity.IdGenerateInfo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: CasGenerator.java, v 0.1 2019年08月29日 19:40:00 white Exp$
 */
@Service
public class CasGenerator extends SequenceGenerator {

    private AtomicReference<SequenceInfo> sequenceInfo = new AtomicReference<SequenceInfo>(new SequenceInfo());

    public void generate(IdGenerateInfo generateInfo, GenerateProperties generateProperties) {
        while (true) {
            long time = TimeGenerator.generateTime(generateProperties.getBeginEpoch());
            SequenceInfo oldSequenceInfo = sequenceInfo.get();
            SequenceInfo newSequenceInfo = new SequenceInfo();
            if (time == oldSequenceInfo.getTimestamp()) {
                newSequenceInfo.setTimestamp(time);
                newSequenceInfo.setSequence(oldSequenceInfo.getSequence() + 1);
            } else {
                newSequenceInfo.setTimestamp(time);
            }
            if (sequenceInfo.compareAndSet(oldSequenceInfo, newSequenceInfo)) {
                generateInfo.setTime(newSequenceInfo.getTimestamp());
                generateInfo.setSequence(newSequenceInfo.getSequence());
                break;
            }
        }
    }


    class SequenceInfo {
        private int sequence;
        private long timestamp;

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }
    }
}
