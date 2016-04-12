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
    public void sayNick(String nick) throws FoolException {
        try {

            if ("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + " 입니다.");
        } catch (FoolException e) {
            System.out.println("FoolException이 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        final Test test =   new Test();
        try {
            test.sayNick("fool");
            test.sayNick("genious");
        } catch (FoolException e) {
            System.out.println("FoolException이 발생했습니다.");
        }
    }
}
