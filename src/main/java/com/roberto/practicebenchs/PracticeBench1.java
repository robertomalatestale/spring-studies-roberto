package com.roberto.practicebenchs;

import com.roberto.model.Character;
import com.roberto.model.GPU;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBench1 {
    public static void main(String[] args) {
        Character character = new Character();     //Traditional way to initialize an object
        System.out.println(character.speak());
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");  //Spring attempt to initialize object (using XML)
        Character character1 = applicationContext.getBean("character", Character.class);
        System.out.println(character1.getAge());
        System.out.println(character1.getAwardName());
        GPU gpu = (GPU) applicationContext.getBean("gpu", GPU.class);
        System.out.println(gpu.getClockSpeed());
    }
}
