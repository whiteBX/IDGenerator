package org.white.idgenerator.service.service;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: IdGenerateService.java, v 0.1 2019年08月27日 19:09:00 white Exp$
 */
public interface IdGenerateService {

    /**
     * 生成二进制id
     * @return
     */
    String genBinaryId();
    /**
     * 生成十进制的id
     * @return
     */
    Long genDecId();

    /**
     * 生成三十二进制的id
     * @return
     */
    String gen32Id();
}
