package Control;

import java.util.ArrayList;

/**
 * Project: jumptojava
 * FileName: If
 * Date: 2016-03-14
 * Time: 오전 12:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class If {
    public static void main(String[] args) {
        final ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("hadphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
    }
}