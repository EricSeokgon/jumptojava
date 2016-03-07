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

        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);

        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0, "hello ");
        System.out.println(sb2.toString());

        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello jump to java");
        System.out.println(sb3.substring(0, 4));
    }
}
