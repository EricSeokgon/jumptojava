package OOP;

/**
 * Project: jumptojava
 * FileName: Bouncer
 * Date: 2016-03-26
 * Time: 오전 3:09
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Bouncer {
    public void barkAnimal(Barkable animal) {
        animal.bark();
    }

    public static void main(String[] args) {
        final Tiger tiger = new Tiger();
        final Lion lion = new Lion();

        final Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }

}
