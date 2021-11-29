package com.example.list;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * 课堂练习：使用 List 的实现类添加四本图书，并遍历，然后进行打印，要求按降格进行排序，从低到高。
 */
@SuppressWarnings("all")
public class ListCaseOne {

    @Test
    public void test01() {
        // List list = new ArrayList<Book>();
        // List list = new Vector<Book>();
        List list = new LinkedList<Book>();
        list.add(new Book("三国", 79));
        list.add(new Book("红楼", 78));
        list.add(new Book("水浒", 80));
        // [Book{name='三国', price=79}, Book{name='红楼', price=78}, Book{name='水浒', price=80}]
        System.out.println(list);
        // 排序
        int size = list.size() - 1;
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size - i; j ++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
        // [Book{name='红楼', price=78}, Book{name='三国', price=79}, Book{name='水浒', price=80}]
        System.out.println(list);
    }


    static class Book {
        private String name;
        private Integer price;

        public Book(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}
