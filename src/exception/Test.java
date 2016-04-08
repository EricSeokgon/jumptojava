package exception;

/**
 * Project: jumptojava
 * FileName: Test
 * Date: 2016-04-09
 * Time: 오전 12:09
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.sayNick("fool");
        test.sayNick("genious");
    }
}
