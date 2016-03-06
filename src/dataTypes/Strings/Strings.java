package dataTypes.Strings;

/**
 * Project: jumptojava
 * FileName: Strings
 * Date: 2016-03-07
 * Time: 오전 3:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Strings {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        String a1 = "hello";
        String b1 = new String("hello");
        System.out.println(a1.equals(b1));
        System.out.println(a1==b1);

        String a2 = "Hello Java";
        System.out.println(a2.indexOf("Java"));
        System.out.println(a2.replaceAll("Java", "World"));
        System.out.println(a2.substring(0, 4));
        System.out.println(a2.toUpperCase());

    }

}
