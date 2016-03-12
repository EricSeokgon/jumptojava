package dataTypes.Generics;

import java.util.ArrayList;

/**
 * Project: jumptojava
 * FileName: Generics
 * Date: 2016-03-13
 * Time: 오전 12:57
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Generics {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("hello");
        aList.add("java");

        String hello = aList.get(0);
        String java = aList.get(1);

        System.out.println(hello);
        System.out.println(java);
    }
}
