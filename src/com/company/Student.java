package com.company;

/**
 * @author William Delarosa
 */

public class Student extends Person implements Talkable {
    private int age;

    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}

