package org.white.idgenerator.service.utils;

import java.math.BigInteger;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: NumberUtil.java, v 0.1 2019年08月27日 10:27:00 white Exp$
 */
public class NumberUtil {

    public static void main(String[] args) {
        String number = "100100111110011001000111011000000000000100000000000000000000101";
        System.out.println(convert(number, 2, 10));
        System.out.println(convert(number, 2, 16));
        System.out.println(convert(number, 2, 32));
    }

    /**
     * 2进制转换为32进制
     * @param num
     * @return
     */
    public static String convertBinTo32(String num) {
        return convert(num, 2, 32);
    }

    /**
     * 2进制转换10进制
     * @param num
     * @return
     */
    public static Long convertBinToDec(String num) {
        return Long.parseLong(convert(num, 2, 10));
    }

    /**
     * 2进制转换16进制
     * @param num
     * @return
     */
    public static String convertBinToHex(String num) {
        return convert(num, 2, 16);
    }

    /**
     * 进制转换
     * @param num
     * @param f
     * @param t
     * @return
     */
    public static String convert(String num, int f, int t) {
        return new BigInteger(num, f).toString(t);
    }
}
