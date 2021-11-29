package com.example.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Set 集合的注意点
 */
@SuppressWarnings("all")
public class SetAttention {

    /**
     * 注意事项：
     *      1. 可以添加 null 值，但是只能存在 1 个 null 值（Set 集合没有重复元素）；
     *      2. 执行 add(E e) 方法时，添加成功返回 true，失败返回 false；
     *      3. Set 集合基于 HashMap
     *
     */
    @Test
    public void test01() {
        Set set = new HashSet();
        System.out.println(set.add("张三"));    // true
        System.out.println(set.add("李四"));    // true
        System.out.println(set.add("王五"));    // true

        System.out.println("==================== 重复添加 赵六 ====================");
        System.out.println(set.add("赵六"));    // true
        System.out.println(set.add("赵六"));    // false

        System.out.println("==================== 重复添加 null ====================");
        System.out.println(set.add(null));     // true
        System.out.println(set.add(null));     // false

        System.out.println("==================== 重复添加 Dog ====================");
        System.out.println(set.add(new Dog("tom")));    // true
        System.out.println(set.add(new Dog("tom")));    // true

        System.out.println("==================== 重复添加 new String ====================");
        System.out.println(set.add(new String("terry")));    // true
        System.out.println(set.add(new String("terry")));    // false

        System.out.println("==================== 打印集合 ====================");
        System.out.println(set);
    }

    class Dog {

        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
