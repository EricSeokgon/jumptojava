package statics;

/**
 * Project: jumptojava
 * FileName: SingletonTest
 * Date: 2016-04-07
 * Time: 오후 11:59
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Singleton {
    private static Singleton one;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }

}

public class SingletonTest {
    public static void main(String[] args) {

        final Singleton singleton1 = Singleton.getInstance();
        final Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.equals(singleton2));
    }
}
