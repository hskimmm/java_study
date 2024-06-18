package generic;

import generic.ex1.Car;
import generic.ex2.Util;
import generic.ex3.*;
import generic.ex4.ChildProduct;
import generic.ex4.Storage;
import generic.ex4.StorageImpl;
import generic.ex4.Tv;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    /*
         제너릭을 사용하는 이유 및 장점?
         - 잘못된 타입을 사용될 수 있는 문제를 컴파일 과정에서 찾을 수 있기 때문에 사용한다.

         제너릭 사용 가능 타입
         - 원시 타입은 사용이 불가능하다
         - 래퍼 클래스나 클래스만 사용이 가능하다.

         배열과 ArrayList의 차이?
         - 크기가 고정인지 가변인지 차이
           - 배열은 크기를 초기화 과정에서 지정한다.
           - ArrayList는 크기를 지정하지 않는다.(데이터에 따라 늘어난다.)

         제한된 파라미터 타입
         명시한 타입만 매개변수 값으로 받는걸 뜻한다.
         public <T extends 상위타입> 리턴 타입 메소드명(매개변수){
         }

         와일드카드 타입
         코드에서 <?> 를 와일드카드라고 한다.
         제너릭 타입을 매개값이나 리턴 타입으로 사용할 때 와일드카드를 사용한다.
         - 제너릭타입<?> : 모든 클래스나 인터페이스 타입이 올 수 있다.
         - 제너릭타입<? extends 상위타입> : 상위 타입이나 하위 타입만 올 수 있다.
         - 제너릭타입<? super 하위타입> : 하위 타입이나 상위 타입만 올 수 있다.

         제네릭 타입의 상속과 구현
         public class ChildProduct<T,M> extends Product<T,M>{
         }
    */
    public static void main(String[] args) {
        /*
            list1의 변수에는 무조건 문자열 값만 넣을 수 있다.
            제너릭에 타입을 명시할 경우 컴파일 과정에서 에러를 확인할 수 있다.
        */
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        String str1 = list1.get(0);
        System.out.println("str1 = " + str1);
        /*
            list2에는 어떠한 값이든 들어갈 수 있다. 단, 컴파일 오류가 발생할 수 있음
            왜냐하면, list2의 값을 꺼낼 때 안에 저장되어있는 값과 값을 꺼내서 담는 타입이 다를 경우 오류가 발생한다.
            그래서 제너릭에 타입을 명시해주는게 좋다.(명시하지 않을 경우 컴파일러 시 에러를 확인할 수 없기 떄문에)
        */
        List list2 = new ArrayList<>();
        list2.add("String");
        String str2 = (String) list2.get(0);
        System.out.println("str2 = " + str2);

        /*
            <T> = 타입(타입을 지정할 수 있다.)
        */
        Box<String> box1 = new Box<>();
        box1.set("1");
        System.out.println("box1 = " + box1.get());

        Box<Integer> box2 = new Box<>();
        box2.set(123);
        System.out.println("box2 = " + box2.get());
        
        Box<Boolean> box3 = new Box<>();
        box3.set(true);
        System.out.println("box3 = " + box3.get());
        
        Box<Double> box4 = new Box<>();
        box4.set(2.7);
        System.out.println("box4 = " + box4.get());

        /*
            제너릭 클래스 연습
        */
        Car<String> car = new Car<>();
        car.setCarName("벤츠");
        System.out.println("자동차 이름 = " + car.getCarName());
        System.out.println(car.isIns()); //제너릭이 String 이여서 Object를 상속받고 있어서 true 이다.

        /*
            제너릭 메서드
        */
        Box<String> box5 = Util.boxing("123");
        System.out.println("box5 = " + box5.get());

        /*
            제한된 메서드 타입
        */
        System.out.println("제한된 메서드 타입1 = " + Util.compareInteger(1, 2));
        System.out.println("제한된 메서드 타입2 = " + Util.compareToString("Hello", "Java"));

        /*
            와일드카드
        */
        Course<Person> personCourse = new Course<>("일반인", 5);
        System.out.println("personCourse = " + personCourse.getName());
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        //와일드카드 - Course<?> -> 모든과정
        Util.registerCourse(personCourse);
        Util.registerCourse(workerCourse);
        Util.registerCourse(studentCourse);
        Util.registerCourse(highStudentCourse);

        //와일드카드 - Course<T extends Student> - 학생과정(상위타입 - 하위타입)
        Util.registerCourseStudent(studentCourse);
        Util.registerCourseStudent(highStudentCourse);
        
        //와일드카드 - Course<T super Worker> - 직장인과정(하위타입 - 상위타입)
        Util.registerCourseWorker(workerCourse);
        Util.registerCourseWorker(personCourse);

        /*
            제너릭 상속
        */
        ChildProduct<Tv,String,String> childProduct = new ChildProduct<>();
        childProduct.setKind(new Tv());
        childProduct.setModal("Smart TV");
        childProduct.setCompany("Samsung");

        System.out.println(childProduct.getKind());
        System.out.println(childProduct.getModal());
        System.out.println(childProduct.getCompany());

        StorageImpl<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);

        System.out.println(storage.get(0));
    }
}
