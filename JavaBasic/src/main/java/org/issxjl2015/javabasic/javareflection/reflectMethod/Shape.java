package org.issxjl2015.javabasic.javareflection.reflectMethod;

public class Shape {
    public void draw() {
        System.out.println("draw");
    }

    public void draw(int count, String name) {
        System.out.println("draw = " + name + ", count = " + count);
    }
}
