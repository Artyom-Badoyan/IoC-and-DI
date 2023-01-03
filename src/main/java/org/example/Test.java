package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        person.callYourPet();
        context.close();
    }
}
