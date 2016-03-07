package dataTypes.StringBuffer;

/**
 * Project: jumptojava
 * FileName: StringBuffer
 * Date: 2016-03-08
 * Time: 오전 3:52
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
    }
}
