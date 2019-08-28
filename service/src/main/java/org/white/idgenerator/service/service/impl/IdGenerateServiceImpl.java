package org.white.idgenerator.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.white.idgenerator.service.config.GenerateProperties;
import org.white.idgenerator.service.entity.IdGenerateInfo;
import org.white.idgenerator.service.generator.IdGenerator;
import org.white.idgenerator.service.generator.LockSequenceGenerator;
import org.white.idgenerator.service.service.IdGenerateService;
import org.white.idgenerator.service.utils.NumberUtil;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: IdGenerateServiceImpl.java, v 0.1 2019年08月27日 19:32:00 white Exp$
 */
@Service
public class IdGenerateServiceImpl implements IdGenerateService {

    @Autowired
    private GenerateProperties generateProperties;
    @Autowired
    private LockSequenceGenerator lockSequenceGenerator;

    public String genBinaryId() {
        return Long.toBinaryString(genId());
    }

    public Long genDecId() {
        return NumberUtil.convertBinToDec(Long.toBinaryString(genId()));
    }

    public String gen32Id() {
        return NumberUtil.convertBinTo32(Long.toBinaryString(genId()));
    }

    private long genId() {
        IdGenerateInfo info = new IdGenerateInfo();
        info.setMachineId(generateProperties.getMachineId());
        info.setVersion(generateProperties.getVersion());
        lockSequenceGenerator.generate(info, generateProperties);
        return IdGenerator.genearte(info, generateProperties);
    }
}
