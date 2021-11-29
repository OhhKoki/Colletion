package com.example;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Colletion 接口常用方法
 */
@SuppressWarnings("all")
public class ColletionMethod {

    /**
     * 添加元素
     */
    @Test
    public void test01() {
        // 1. 添加单个元素：boolean add(E e);
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list: " + list);

        // 2. 在指定 index 处添加一个元素：void add(int index, E element);
        List hobbits = new ArrayList();
        hobbits.add("篮球");
        hobbits.add("足球");
        hobbits.add("台球");
        hobbits.add(0, "冰球");    // index 从 0 开始
//        hobbits.add(5, "毛球");    // java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
        System.out.println("hobbits: " + hobbits);

        // 3. 添加一个集合：boolean addAll(Collection<? extends E> c);
        List books = new ArrayList();
        books.add("西游记");
        books.add("水浒传");
        books.add("红楼梦");
        list.addAll(books);
        System.out.println("list: " + list);

        // 4. 在指定的 index 处添加一个集合：boolean addAll(int index, Collection<? extends E> c);
        List gender = new ArrayList();
        gender.add("男");
        gender.add("女");
        list.addAll(0, gender);
        System.out.println("list: " + list);
    }


    /**
     * 删除元素
     */
    @Test
    public void test02() {
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list: " + list);

        // 1. 根据元素名删除：boolean remove(Object o);
        list.remove("tom");
        System.out.println("list: " + list);

        // 2. 根据 index 删除：E remove(int index);
//        list.remove(2);    //java.lang.IndexOutOfBoundsException: Index: 2, Size: 2
        list.remove(1);
        System.out.println("list: " + list);

        // 3. 直接清空整个集合：void clear();
        list.clear();
        System.out.println("list: " + list);
    }


    /**
     * 修改元素
     */
    @Test
    public void test03() {
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list: " + list);

        // 修改指定 index 处的元素为指定值：E set(int index, E element);
        list.set(1, 20);
        System.out.println("list: " + list);
    }

    /**
     * 查询元素
     */
    @Test
    public void test04() {
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list: " + list);

        // 判断是否包含指定的元素，需要 equal 支持：boolean contains(Object o);
        System.out.println(list.contains("tom"));
    }


    /**
     * 其他方法
     */
    @Test
    public void test05() {
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list: " + list);

        // 1. 判断是否为空集合：boolean isEmpty();
        System.out.println(list.isEmpty());

        // 2. 获取集合中元素的个数：int size();
        System.out.println(list.size());

        // 3. 将集合转为 Object 数组：Object[] toArray();
        Object[] objects = list.toArray();
        System.out.println(objects);

        //4. 获取该集合的一个 Iterrator 接口实例，用于进行迭代：Iterator<E> iterator();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
