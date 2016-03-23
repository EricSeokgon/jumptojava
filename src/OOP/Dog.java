package OOP;

/**
 * Project: jumptojava
 * FileName: Dog
 * Date: 2016-03-21
 * Time: 오전 12:05
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Animal {
    public Dog(){

    }

    public void sleep() {
        dogName(this.name + " zzz");
    }

    public static void main(String[] args) {
        final Dog dog = new Dog();
        dog.setName("poppy");
        dogName(dog.name);
        dog.sleep();
    }

    private static void dogName(String name) {
        System.out.println(name);
    }
}
