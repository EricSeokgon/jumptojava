package statics;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project: jumptojava
 * FileName: Util
 * Date: 2016-04-07
 * Time: 오전 12:08
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
