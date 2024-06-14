package exception;

public class Exception {
    /*
        1.에러란?
        - 에러란, 프로그램 실행 중에 발생하는 '심각한 문제로' 프로그램이 비정상적으로 종료 되는걸 말한다.
          에러는 주로 JVM에서 발생하며, 개발자가 직접 처리할 수 없다.
          대표적인 에러로는 OutOfMemoryError, StackOverflowError 등이 있다.(런타임 에러)

        2.예외란?
        - 예외란, 프로그램 실행 중에 발생하는 비정상적인 상황으로, 개발자가 직접 처리할 수 있다.
          예외는 try-catch, throws 키워드를 사용하여 프로그램이 비정상적으로 종료 되는걸 방지할 수 있다.
          대표적인 예외로는 NullPointException, ArrayIndexOutOfBoundsException 등이 있다.

        3.예외 구조
        Throwable - Error
                  - Exception - RuntimeException(언체크드 예외)
                              - IOException, SQLException(체크드 예외)

        - Throwable : 모든 에러와 예외의 최상위 클래스이다.
            - Error : 시스템 레벨에서 발생하는 심각한 오류이다.(OutOfMemoryError, StackOverflowError 등)
            - Exception : 개발자가 처리할 수 있는 예외 상황이다.
                - RuntimeException : 언체크드 예외 이다.(NullPointException, ArrayIndexOutOfBoundException 등)
                - IOException, SQLException : 체크드 예외이다.(FileNotFoundException, IOException 등)
                - 언체크드 예외 : 컴파일 시점에서 예외 처리를 강제하지 않는다.(프로그램 실행중 예외가 발생한다.)
                - 체크드 예외 : 컴파일 시점에서 예외 처리를 강제한다.(프로그램 구동 시에 예외가 발생한다.(예외가 있을 경우 프로그램 실행이 안된다.))
                - 언체크드 예외는 주로 프로그래밍 오류에 의해 발생하며, 체크드 예외는 주로 외부 요인(파일, 네트워크 등)에 의해 발생한다.

        4.Java 예외 처리 방법
        - try-catch 예외 처리
            - finally : 예외 발생 여부와 상관 없이 항상 실행된다. 주로 자원을 해제하는 등의 작업에 사용한다.
        - throws 키워드를 사용하며 예외를 호출한 쪽으로 전파하는 방법

        5.예외 처리 커스텀
        - 예외 처리를 커스텀을 통해서 많이 사용한다.

    */
}


