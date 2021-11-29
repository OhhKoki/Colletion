package com.example.set;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet 源码浅析，结论如下：
 *
 *      1. LinkedHashSet 是 HashSet 的子类，底层是一个 LinkedHashMap；
 *
 *      2. LinkedHashSet 中的每个节点都存在一个 before（指向当前节点的上一个节点）和 after（指向当前节点的下一个节点）属性，从而形成一个双向链表；
 *
 *      3. LinkedHashSet 中维护了一个 head（指向双向链表的头） 和 tail 属性（指向双向链表的尾）；
 *
 *      4. LinkedHashSet 中添加一个元素的流程：
 * 	        1）根据 key 得到 hash 值；
 *          2）根据 hash 值得到 index；
 *          3）然后将元素添加在 table[index] 处；
 *          4）添加逻辑大致如下：
 *     	        tail.next = newElement;
 * 		        newElement.pre = tail;
 * 		        tail = newElement
 */
@SuppressWarnings("all")
public class LinkedHashSetSourceTracking {

    @Test
    public void test01() {
        Set set = new LinkedHashSet();
        set.add("张三");
        set.add("李四");
        set.add("令牌");
        set.add("令牌");
        System.out.println(set);
    }

}
