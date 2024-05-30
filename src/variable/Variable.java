package variable;

public class Variable {
    public static void main(String[] args) {
        /*
            컴파일러 에러 = 프로그램 컴파일러시 발생하는 에러
            런타임 에러 = 프로그램이 동작하는 중에 발생하는 에러(치명적인 에러)
        */


        //=================================== 1.변수 선언 및 초기화 ===================================

        //변수 선언 및 초기화 방법
        int a; // 변수 선언
        a = 10; // 변수 초기화
        System.out.println("a = " + a);

        int b = 20; // 선언과 초기화
        System.out.println("b = " + b);


        //=================================== 2.변수 선언시 메모리 ===================================

        /*
            변수 생성 시 메모리에 변수 x의 할당된 공간이 생성된다.
            변수명으로 메모리에 접근하여 데이터를 사용한다.
            프로그램이 종료 되어야지 메모리에서 제거된다.
        */
        int x = 0;

        /*
            지역 변수는 초기화해야한다.
            초기화하지 않고 사용할 경우 컴파일러 에러가 발생한다.

            이유는?
            변수를 초기화하지 않고 메모리에 생성할 경우
            변수를 생성한 메모리의 공간에 이전에 어떠한 값이 있었는지 모르기 떄문에
            초기화하지 않고 출력할 경우 이상한 값을 출력할 수 있기 때문인다.

            예외
            클래스 변수(멤버변수), 인스턴스 변수는 자바에서 자동으로 초기화를 시켜준다.
            숫자형 : 0
            참조형 : null
            boolean : false

            변수의 종류
            - 지역변수 : 메서드 및 매개변수, 개발자가 직접 초기화
            - 멤버변수 : 클래스의 변수, 자바에서 자동 초기화
        */
        int e;
        //System.out.println("e = " + e); 컴파일러 에러발생


        //=================================== 3.자료형의 종류 ===================================

        /*
            정수형 타입
            - int, long 정수형을 주로 많이 사용한다.
            - byte 정수형은 파일을 다룰때만 주로 사용된다.
            - byte(1byte), short(2byte), int(4byte), long(8byte)
        */
        int i = 1;
        long l = 2L;
        byte bt = 3;
        short s = 4;
        System.out.println("정수형 int = " + i);
        System.out.println("정수형 long = " + l);
        System.out.println("정수형 byte = " + bt);
        System.out.println("정수형 short = " + s);

        /*
            실수형 타입
            - double 실수형을 주로 많이 사용한다.
            - float 실수형은 데이터의 정확성이 불안정하기 때문에 사용하지 않는다.
            - float(4byte), double(8byte)
        */
        float f = 2.0f;
        double d = 1.0;
        System.out.println("실수형 float = " + f);
        System.out.println("실수형 double = " + d);
        
        /*
            문자 타입
            - char(2byte)
        */
        char c = 'c';
        System.out.println("문자 타입 = " + c);

        /*
            boolean 타입
            - 참/거짓의 조건에 많이 사용된다.
            - boolean(1byte)
        */
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("불리언 타입 = " + isTrue);
        System.out.println("불리언 타입 = " + isFalse);

        /*
            문자열 타입
            - String 타입은 원래 참조형이지만 많이 사용됨으로 자바에서 편의로 값을 변수를 통해 꺼내 사용할 수 있다.
        */
        String str = "String";
        System.out.println("문자열 자료형 = " + str);
    }
}
