package org.issxjl2015.javabasic.javareflection.reflectfield;

import java.lang.reflect.Field;

public class ReflectField {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazz = Class.forName("org.issxjl2015.javabasic.javareflection.reflectfield.Student");

        Field field = clazz.getField("age");
        System.out.println("field:" + field);

        // 获取所有修饰符为public的字段，包含父类字段，注意修饰符为public的才会获取
        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println("f: " + f.getDeclaringClass());
        }

        System.out.println("============getDeclaredFields===============");
        // 获取指定字段名称的Field类，可以是任意修饰符的字段，注意不包含父类的字段
        Field field2 = clazz.getDeclaredField("desc");
        System.out.println("field2: " + field2);
    }
}
