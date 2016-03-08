package dataTypes.Arrays;

/**
 * Project: jumptojava
 * FileName: Arrays
 * Date: 2016-03-09
 * Time: 오전 3:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] odds = {1, 2, 3, 4, 5};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks[3]+"\n");
        for (String week: weeks) {
            System.out.println(week);
        }

    }
}
