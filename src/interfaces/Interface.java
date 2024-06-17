package interfaces;

import interfaces.ex1.ApplePhone;
import interfaces.ex1.Phone;
import interfaces.ex1.SamsungPhone;
import interfaces.ex2.ImpleC;
import interfaces.ex2.InterfaceA;
import interfaces.ex2.InterfaceB;
import interfaces.ex2.InterfaceC;
import interfaces.ex3.Car;
import interfaces.ex3.KiaCar;
import interfaces.ex4.ProfileDBRepository;
import interfaces.ex4.ProfileMemoryRepository;
import interfaces.ex4.ProfileService;

public class Interface {
    public static void main(String[] args) {
        /*
            - 부모 인터페이스의 메서드는 자식 클래스에서 무조건 오버라이딩 하여 재정의 해야 한다.

            - 인터페이스는 다중으로 상속(?)이 가능하다.
            - ,(콤마) 키워드를 통해 다중으로 상속(?)이 가능하다.

            - 상속은 단일 상속이다.

            다형성
            - 부모의 객체는 자식의 객체를 담을 수 있다.
            - 부모 객체로 인스턴스 할 경우 메모리에서 부모의 공간 부터 찾아가서 call 함수를 찾고
              찾지 못하면 자식의 공간에서 찾는다.
            - 원래는 자식의 객체로 인스턴스하면 메모리의 자식의 공간에서부터 call 함수를 찾고
              찾지 못하면 부모의 공간에서 찾는다.
        */

        //부모에 자식을 담음
        Phone applePhone = new ApplePhone();
        System.out.println(applePhone.call());
        System.out.println(applePhone.answerThePhone());

        Phone samsungPhone = new SamsungPhone();
        System.out.println(samsungPhone.call());
        System.out.println(samsungPhone.answerThePhone());

        //자식을 인스턴스
        ApplePhone applePhone1 = new ApplePhone();
        System.out.println(applePhone1.call());
        System.out.println(applePhone1.answerThePhone());

        SamsungPhone samsungPhone1 = new SamsungPhone();
        System.out.println(samsungPhone1.call());
        System.out.println(samsungPhone1.answerThePhone());

        System.out.println("======================");
        InterfaceA interfaceA = new ImpleC();
        interfaceA.methodA();
        System.out.println("======================");
        InterfaceB interfaceB = new ImpleC();
        interfaceB.methodB();

        System.out.println("======================");
        InterfaceC impleC = new ImpleC();
        impleC.methodA();
        impleC.methodB();
        impleC.methodC();

        System.out.println("======================");
        Car kiaCar = new KiaCar();
        System.out.println(kiaCar.carName());
        System.out.println(kiaCar.getTier());
        kiaCar.amountNavi();
        System.out.println(kiaCar.showEngine());
        kiaCar.showDefault(); // 디폴트 메소드(구현X)

        //자바의 다형성(부모에는 자식을 담을 수 있다.)
        System.out.println("======================");
        ProfileService profileService = new ProfileService();
        profileService.saveProfile(new ProfileDBRepository());
        profileService.saveProfile(new ProfileMemoryRepository());
    }
}
