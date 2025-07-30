package com.roberto.model;

import org.springframework.stereotype.Component;

@Component
public class Character {
    private String name;
    private int age;
    private Award award;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 22){
            throw new IllegalArgumentException("Age can't be this value");
        }
        this.age = age;
    }

    public Award getAward() {
        return award;
    }

    public void setAward(Award award) {
        this.award = award;
    }

    public String getAwardName(){
        return award.getName();
    }

    public String speak(){
        return "I can speak";
    }
}
