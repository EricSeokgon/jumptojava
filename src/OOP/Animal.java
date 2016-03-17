package OOP;

/**
 * Project: jumptojava
 * FileName: Animal
 * Date: 2016-03-18
 * Time: 오전 12:22
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        final Animal cat = new Animal();
        cat.setName("boby");
        System.out.println(cat.name);
    }
}
