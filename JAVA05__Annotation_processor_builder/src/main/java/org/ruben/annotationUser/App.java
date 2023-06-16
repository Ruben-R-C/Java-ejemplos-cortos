package org.ruben.annotationUser;

public class App {

    public static void main(String[] args) {
        Person person = new PersonBuilder().setAge(25).setName("John").build();
        System.out.println(person);
    }
}
