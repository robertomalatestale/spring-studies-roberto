package com.roberto.practicebenchs;

import com.roberto.model.Character;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBench1 {
    public static void main(String[] args) {
        //Traditional way to initialize an object
        Character character = new Character();
        System.out.println(character.speak());
        //Spring attempt to initialize object
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Character character1 = applicationContext.getBean(Character.class);
        System.out.println(character1.speak());
    }
}
