package org.issxjl2015.javabasic.javareflection;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ConstructionTest implements Serializable {
    public static void main(String[] args) throws Exception {
        // 获取Class对象的三种方式
        System.out.println("根据类名：\t" + User.class);
        System.out.println("根据对象：\t" + new User().getClass());
        System.out.println("根据全限定类名： \t" + Class.forName("org.issxjl2015.javabasic.javareflection.User"));

        System.out.println("-------------------------------");

        Class<?> clazz = null;

        // 获取 Class对象的引用
        clazz = Class.forName("org.issxjl2015.javabasic.javareflection.User");

        // 常用的方法
        System.out.println("获取全限定类名： \t" + clazz.getName());
        System.out.println("获取类名： \t" + clazz.getSimpleName());
        System.out.println("实例化： \t" + clazz.newInstance());
        System.out.println("-----------------------------");
        User user = (User) clazz.newInstance();
        user.setAge(20);
        user.setName("jack");
        System.out.println(user);

        System.out.println("-------------------");

        // 获取带 String 参数的 public 构造函数
        Constructor cs1 = clazz.getConstructor(String.class);
        // 创建 User
        User user1 = (User) cs1.newInstance("hiwap");
        user1.setAge(22);
        System.out.println("user1:" + user1.toString());

        System.out.println("------------------------");

        Constructor cs2 = clazz.getDeclaredConstructor(int.class, String.class);
        // 由于是private，必须要设置可访问
        cs2.setAccessible(true);
        // 创建 user 对象
        User user2 = (User) cs2.newInstance(25, "hiway2");
        System.out.println("user2:" + user2.toString());

        System.out.println("------------------------");

        Constructor<?> cons[] = clazz.getDeclaredConstructors();
        // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            // 获取构造函数参数类型
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.println("构造函数[" + i + "]:" + cons[i].toString());
            System.out.print("参数类型[" + i + "]:(");

            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1) {
                    System.out.print(clazzs[j].getName());
                } else {
                    System.out.print(clazzs[j].getName() + ",");
                }
            }
            System.out.println(")");
        }
    }
}
