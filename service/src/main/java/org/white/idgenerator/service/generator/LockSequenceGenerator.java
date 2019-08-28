package org.white.idgenerator.service.generator;

import org.springframework.stereotype.Component;
import org.white.idgenerator.service.config.GenerateProperties;
import org.white.idgenerator.service.entity.IdGenerateInfo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: LockSequenceGenerator.java, v 0.1 2019年08月27日 11:43:00 white Exp$
 */
@Component
public class LockSequenceGenerator extends SequenceGenerator {

    private ReentrantLock lock = new ReentrantLock();

    /**
     * 通过锁来实现
     * @param generateInfo
     * @param generateProperties
     */
    public void generate(IdGenerateInfo generateInfo, GenerateProperties generateProperties) {
        lock.lock();
        try {
            long time = TimeGenerator.generateTime(generateProperties.getBeginEpoch());
            if (time == timestamp) {
                sequence++;
            }else {
                sequence = 0;
                timestamp = time;
            }
            generateInfo.setSequence(sequence);
            generateInfo.setTime(time);
        }finally {
            lock.unlock();
        }
    }
}
