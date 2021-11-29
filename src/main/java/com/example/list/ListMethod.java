package com.example.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * List 相对于 Colletion 新增的常用方法
 */
@SuppressWarnings("all")
public class ListMethod {

    /**
     * 根据 index 获取元素
     */
    @Test
    public void test01() {
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list: " + list);

        // 根据索引获取元素：E get(int index);
        System.out.println(list.get(0));
        System.out.println(list.get(3));    // java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
    }

}
