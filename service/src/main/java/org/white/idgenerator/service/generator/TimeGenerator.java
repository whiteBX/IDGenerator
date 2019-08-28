package org.white.idgenerator.service.generator;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: TimeUtils.java, v 0.1 2019年08月27日 11:36:00 white Exp$
 */
public class TimeGenerator {

    /**
     * 此处时间格式直接用的减去某一固定时间方式，如有需要可修改此方法实现
     * @param beginEpoch
     * @return
     */
    public static long generateTime(long beginEpoch) {
        return System.currentTimeMillis() / 100 - beginEpoch;
    }
}
