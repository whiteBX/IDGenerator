package org.white.idgenerator.service.generator;

import org.white.idgenerator.service.config.GenerateProperties;
import org.white.idgenerator.service.entity.IdGenerateInfo;

/**
 * <p>
 * 版本号2位 + 秒级时间30位 + 序列号20位 + 机器id5位 = 57位二进制
 * </p >
 *
 * @author white
 * @version $Id: IdGenerator.java, v 0.1 2019年08月27日 19:11:00 white Exp$
 */
public class IdGenerator {

    /**
     * 生成id  1 | 0 = 1，或出所有1
     *
     * @param info
     * @param generateProperties
     * @return
     */
    public static long genearte(IdGenerateInfo info, GenerateProperties generateProperties) {
        long id = 0;
        id |= info.getMachineId();
        id |= info.getSequence() << generateProperties.getMachineIdLength();
        id |= info.getTime() << (generateProperties.getMachineIdLength() + generateProperties.getSequenceLength());
        id |= info.getVersion() << (generateProperties.getMachineIdLength() + generateProperties.getSequenceLength() + 30);
        return id;
    }
}
