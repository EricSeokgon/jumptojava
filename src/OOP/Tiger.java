package OOP;

/**
 * Project: jumptojava
 * FileName: Tiger
 * Date: 2016-03-25
 * Time: 오전 12:34
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Tiger extends Animal implements Barkable {
    public String getName() {
        return this.name;
    }

    public void bark() {
        System.out.println("어흥");
    }
}
