package org.white.idgenerator.service.entity;

/**
 * <p>
 * 总构成：
 * 版本号2位 + 秒级时间30位 + 序列号20位 + 机器id5位 = 57位二进制
 * 除时间30位外需要扩充的可以扩充,但是位置必须跟着改
 * </p >
 *
 * @author white
 * @version $Id: IdGenerateInfo.java, v 0.1 2019年08月27日 11:24:00 white Exp$
 */
public class IdGenerateInfo {
    /**
     * 版本号
     */
    private int version;
    /**
     * 时间值   表示当前时间减去一个固定时间
     */
    private Long time;
    /**
     * 序列值
     */
    private Integer sequence;
    /**
     * 机器ID
     */
    private int machineId;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}
