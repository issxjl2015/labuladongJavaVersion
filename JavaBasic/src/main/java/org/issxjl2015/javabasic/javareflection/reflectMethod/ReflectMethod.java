package org.issxjl2015.javabasic.javareflection.reflectMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args)
            throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InstantiationException,
            InvocationTargetException {
        Class clazz = Class.forName("org.issxjl2015.javabasic.javareflection.reflectMethod.Circle");

        // 根据参数获取public的Method，包含继承自父类的方法
        Method method = clazz.getMethod("draw", int.class, String.class);

        System.out.println("method: " + method);

        // 获取所有 public 的方法
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println("m : " + m);
        }

        System.out.println("--------------------");

        // 获取当前类的方法包含private，该方法无法获取继承自父类的 method
        Method method1 = clazz.getDeclaredMethod("drawCircle");
        System.out.println("method1: " + method1);

        // 获取当前类的所有方法包含 private，该方法无法获取继承自父类的 method
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("m1: " + m);
        }

        // 创建对象
        Circle circle = (Circle) clazz.newInstance();

        // 获取指定参数的方法对象 Method
        Method method2 = clazz.getMethod("draw", int.class, String.class);

        // 通过Method对象的invoke(Object obj, Object... args)方法调用
        // 第一个参数代表调用的对象，第二个参数传递的调用方法的参数，这样就完成了类方法的动态调用
        method2.invoke(circle, 15, "圈圈");

        // 对私有方法无参方法的操作
        Method method3 = clazz.getDeclaredMethod("drawCircle");
        // 修改私有方法的访问标识
        method3.setAccessible(true);
        method3.invoke(circle);

        // 对有返回值的方法操作
        Method method4 = clazz.getDeclaredMethod("getAllCount");
        Integer count = (Integer) method4.invoke(circle);
        System.out.println("count: " + count);
    }
}
