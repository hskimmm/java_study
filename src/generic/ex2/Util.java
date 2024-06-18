package generic.ex2;

import generic.Box;
import generic.ex3.Course;
import generic.ex3.Student;
import generic.ex3.Worker;

import java.util.Arrays;

public class Util {
    /*
        제너릭 메서드
        반환 타입 -> Box<T>
    */
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    /*
        제한된 파라미터 타입
    */
    public static <T extends Number> int compareInteger(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return Double.compare(v1, v2);
    }

    public static <T extends String> String compareToString(T t1, T t2) {
        return t1.equals(t2)? "okay" : "no";
    }

    /*
        와일드카드 - 모든 타입
        - Person, Worker, Student, HighStudent
    */
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
    }

    /*
        와일드카드 - 상위타입 하위타입
        - Student, HighStudent
    */
    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
    }

    /*
        와일드카드 - 하위타입 상위타입
        - Worker, Person
    */
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
    }
}
