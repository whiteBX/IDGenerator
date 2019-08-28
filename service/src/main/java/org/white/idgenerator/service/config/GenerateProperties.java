package org.white.idgenerator.service.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author white
 * @version $Id: GenerateProperties.java, v 0.1 2019年08月27日 11:05:00 white Exp$
 */
@Component
@PropertySource("classpath:generate.properties")
public class GenerateProperties {
    /**
     * 版本号，默认占2位，即二进制的00，重大版本变更时配置，需要扩容的话要同步改动versionLength
     */
    private int version = 0;

    private int versionLength = 2;
    /**
     * 序列号占用字节，默认占20位 即每秒2^20个序列，按需配置
     */
    private Integer sequenceLength = 20;
    /**
     * 机器ID，默认占5位，即二进制的00000，可以支持32台服务器，需要扩容的话要同步改动machineIdLength
     */
    private int machineId = 0;

    private int machineIdLength = 5;
    /**
     * 开始时间
     */
    private Long beginEpoch = 1533686888L;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersionLength() {
        return versionLength;
    }

    public void setVersionLength(int versionLength) {
        this.versionLength = versionLength;
    }

    public Integer getSequenceLength() {
        return sequenceLength;
    }

    public void setSequenceLength(Integer sequenceLength) {
        this.sequenceLength = sequenceLength;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getMachineIdLength() {
        return machineIdLength;
    }

    public void setMachineIdLength(int machineIdLength) {
        this.machineIdLength = machineIdLength;
    }

    public Long getBeginEpoch() {
        return beginEpoch;
    }

    public void setBeginEpoch(Long beginEpoch) {
        this.beginEpoch = beginEpoch;
    }
}
