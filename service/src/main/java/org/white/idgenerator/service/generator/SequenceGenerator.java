package org.white.idgenerator.service.generator;

import org.white.idgenerator.service.config.GenerateProperties;
import org.white.idgenerator.service.entity.IdGenerateInfo;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: SequenceGenerator.java, v 0.1 2019年08月27日 11:05:00 white Exp$
 */
public abstract class SequenceGenerator {
    /**
     * 当前序号
     */
    protected int sequence;
    /**
     * 序号对应时间戳
     */
    protected long timestamp;

    public abstract void generate(IdGenerateInfo generateInfo, GenerateProperties generateProperties);
}
