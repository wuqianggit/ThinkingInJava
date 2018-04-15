package containers;

import org.junit.Test;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * containers
 * 有序的排序Set
 *
 * 测试需求：有一个学生类 Student,每个学生有一个成绩grade属性，我要按照这个属性，从大到小排列。
 * 将学生放到TreeSet中，然后输入Set的结果
 * 2018/4/13-21:55
 * 2018
 * Created by wuqiang on 2018/4/13.
 */

class Student implements Comparable<Student>{
    private Integer grade;

    public Student(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "grade=" + grade + '}';
    }

    @Override
    public int compareTo(Student o) {
        return grade.compareTo(o.grade);
    }
}

public class SortedSetTest {
    /**
     * 测试排序Set
     */
    @Test
    public void testSortedSet(){

        SortedSet<Student> set=new TreeSet<Student>();
        set.add(new Student(30));/*学生要实现 Comparable接口*/
        set.add(new Student(40));/*学生要实现 Comparable接口*/
        set.add(new Student(20));/*学生要实现 Comparable接口*/

        Student s=new Student(50);

        System.out.println(set);
    }


}
