package collection.map;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student) {
            Student student = (Student) o;
            return (no == student.no) && (name.equals(student.name));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + no;
    }
}
