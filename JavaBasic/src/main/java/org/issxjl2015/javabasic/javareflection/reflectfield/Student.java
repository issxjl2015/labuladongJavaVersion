package org.issxjl2015.javabasic.javareflection.reflectfield;

import org.issxjl2015.javabasic.javareflection.reflectfield.Person;

public class Student extends Person {
    public String desc;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
