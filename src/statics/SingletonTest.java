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
    private Singleton() {
    }

    public static Singleton getInstance() {
        return new Singleton();
    }

}

public class SingletonTest {
    public static void main(String[] args) {
        //final Singleton singleton = new Singleton();
        final Singleton singleton = Singleton.getInstance();
    }
}
