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
    public static void main(String[] args) {
        final Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
    }
}