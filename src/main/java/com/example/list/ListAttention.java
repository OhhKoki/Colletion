package com.example.list;

import org.junit.Test;

import java.util.List;
import java.util.Vector;

/**
 * List 集合的注意点
 */
@SuppressWarnings("all")
public class ListAttention {

    /**
     * 注意事项：
     *      1. 可以添加 null 值；
     *      2. 可以添加多个 null 值；
     *      3. null 值的添加也是有序的
     *      4. ArrayList 与 Vector 的区别是：ArrayList 是线程不安全的，Vector 是线程安全的；
     *      5. ArrayList 与 LinkedList 的区别是：ArrayList 是数组实现，LinkedList 是链表实现；
     *
     */
    @Test
    public void test01() {
        // List list = new ArrayList();
        // List list = new LinkedList();
        List list = new Vector();

        // 1. 可以添加 null 值
        list.add(null);

        // 2. 可以添加多个 null 值
        list.add(null);

        // 3. null 值的添加也是有序的
        list.add("terry");
        System.out.println(list);
    }

}
