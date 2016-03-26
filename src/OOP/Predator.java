package OOP;

/**
 * Project: jumptojava
 * FileName: Predator
 * Date: 2016-03-25
 * Time: 오전 12:38
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public abstract class Predator extends Animal {
    public abstract String getName();

    public boolean isPredator() {
        return true;
    }
}
