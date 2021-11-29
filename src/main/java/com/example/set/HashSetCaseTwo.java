package com.example.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * 课堂练习：
 *      1. 定义一个 Employee 类，包含 name 和 age 与 birthday（自定义的 MyDate 类）
 *      2. MyDate 类包含 year、month、day
 *      3. 创建 4 个 Employee 类对象;
 *      4. 当 name 和 birthday 相同时，不允许添加到集合中
 */
@SuppressWarnings("all")
public class HashSetCaseTwo {

    @Test
    public void test01() {
        Set set = new HashSet();
        set.add(new Employee("zhangsan", 18, new MyDate(2021, 9, 29)));
        set.add(new Employee("lisi", 18, new MyDate(2021, 9, 29)));
        set.add(new Employee("wangwu", 18, new MyDate(2021, 9, 29)));
        set.add(new Employee("zhangsan", 18, new MyDate(2021, 9, 29)));
        set.add(new Employee("zhangsan", 18, new MyDate(2021, 9, 30)));

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    class Employee {
        private String name;
        private Integer age;
        private MyDate birthday;

        public Employee(String name, Integer age, MyDate birthday) {
            this.name = name;
            this.age = age;
            this.birthday = birthday;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return name.equals(employee.name) && birthday.equals(employee.birthday);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, birthday);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", birthday=" + birthday +
                    '}';
        }
    }

    class MyDate {
        private Integer year;
        private Integer month;
        private Integer day;

        public MyDate(Integer year, Integer month, Integer day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyDate myDate = (MyDate) o;
            return year.equals(myDate.year) && month.equals(myDate.month) && day.equals(myDate.day);
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }

        @Override
        public String toString() {
            return "MyDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }
    }

}
