package com.example.list;

import org.junit.Test;

import java.util.LinkedList;

/**
 * LinkedList 源码浅析：
 *
 *      1. LinkedList 底层维护了一个双向链表；
 *
 *      2. LinkedList 维护了两个属性：
 * 	        1）first：指向链表的头节点
 *          2）last：指向链表的尾节点
 *
 *      3. 每个 Node 对象中，维护了 3 个属性：
 * 	        1）prev：指向当前节点的前一个节点
 *          2）next：指向当前节点的下一个节点
 *          3）item：当前节点中保存的数据内容
 *
 *      4. 由于 LinkedList 是基于链表实现的，所以增加和删除操作更简单；
 */
@SuppressWarnings("all")
public class LinkedListSourceTracking {

    @Test
    public void test01() {
        LinkedList list = new LinkedList();
        // 1. 添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        // 2. 删除元素
        list.remove();
        System.out.println(list);

        // 3. 修改元素
        list.set(0, "terry");
        System.out.println(list);

        // 4. 查询元素
        System.out.println(list.get(0));

        // 5. 集合遍历：因为 LinkedList 是 List 的子类，所以可以使用 List 三种遍历方式=
    }

}
