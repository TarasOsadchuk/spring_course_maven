package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");
//
//        System.out.println(myDog.getName() + ", " + yourDog.getName());
//        System.out.println(myDog==yourDog);
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
}
