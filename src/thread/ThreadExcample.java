package thread;

public class ThreadExcample {
    public static void main(String[] args) throws InterruptedException {
        /*
            프로세스와 스레드
            - 프로세스 : 운영체제로부터 자원을 할당받은 작업의 단위
            - 스레드 : 프로세스가 할당받은 자원을 이요하는 실행 흐름의 단위

            프로세스
            프로세스란 컴퓨터가 무언가를 하고 있는 상태를 말한다.
            예로는, 컴퓨터의 작업관리자를 보면 현재 실행 중인 프로세스를 확인할 수 있다.

            스레드
            스레드란 하나의 프로세스 안에서 진행되는 작업을 의미한다.
            예로는, 크롬 브라우저를 실행하면 하나의 프로세스만 생성되지만,
            그 안에서 영상시청, 파일 다운로드, 쇼핑 등을 동시에 할 수 있다.
            이처럼 프로세스 안에서 수행되는 작업을 스레드라고 하며, 스레드가 여러개 있다면 다중 스레드라고 한다.

            프로세스 내부 구조
            프로그램을 실행 하면 운영체제가 메모리에 프로세스를 할당한다.

            Code 영역 : 개발자가 작성한 소스코드가 컴퓨터가 이해할 수 있는 기계어 형태로 저장되어 있다.
            Data 영역 : 코드가 실행되면서 사용하는 전역 변수나 static 변수들이 저장되어 있다.
            Stack 영역 : 함수가 호출 되면 Stack 영역에 할당되며 함수가 종료 되면 제거된다.
                         함수에서 사용하는 지역 변수도 같이 제거가 된다.
                         만약 프로세스에 할당된 메모리보다 Stack 영역을 많이 사용하면 stackoverflow 에러가 발생한다.
            Heap 영역 : 생성자, 인스턴스와 같은 동적으로 할당되는 데이터들을 저장한다.

            스레드 내부 구조
            스레드는 프로세스가 할당받은 자원을 이용한다. 여러개의 스레드가 있다면 스레드끼리 자원을 공유하기 때문에
            동시 작업이 가능하다.
            스레드는 Stack 영역만 별도로 사용하고 Code, Data, Heap 영역은 다른 스레들과 공유한다.

            스레드 사용방법
            - Thread 클래스를 상속 받는 방법
            - Runnable 인터페이스를 구현 하는 방법(이 방법을 많이 사용한다.)

            스레드 생명주기

            1.Runnable(준비상태)
            - 스레드가 실행되기 위한 준비상태이다.
            - CPU를 점유하고 있지 않으며, 실행을 위해 대기 상태이다.
            - start() 메소드를 호출하면 해당 스레드가 Runnable 상태로 진입한다.(Ready 상태)

            2.Running(실행상태)
            - CPU를 점유하며 실행 중인 상태이다.
            - run() 메소드는 JVM 에서만 호출 가능하며, 우선 순위가 높은 스레드가 결정되면 자동으로 호출된다.

            3.Dead(종료상태)
            - 실행 중인 스레드가 모두 실행을 마친 후의 완료 상태이다.
            - 종료된 스레드는 'Done' 상태로도 불린다.

            4.Blocked(지연상태)
            - CPU 점유권을 상실한 상태로, 특정 메서드 실행을 통해 Runnable 상태로 전환된다.
            - wait() 메소드로 Blocked 상태가 된 스레드는 notify() 메소드 호출 시 Runnable 상태로 전환된다.
            - sleep(시간) 메소드로 Bolocked 상태가 된 스레드는 지정된 시간이 지나면 Runnable 상태로 전환된다.
        */

        //Thread 상속 받는 방법
        MyThread myThread = new MyThread("스레드1");
        MyThread myThread1 = new MyThread("스레드2");
        MyThread myThread2 = new MyThread("스레드3");
        MyThread myThread3 = new MyThread("스레드4");
        MyThread myThread4 = new MyThread("스레드5");

        /*
            결과값이 순차적으로 나오는 것이 아닌 랜덤으로 나온다.
            그래서, 스레드는 순차를 보장하지 않는다.
            -> 순차적으로 동작할 시 동시성 이슈가 발생하지 않는다.
               이렇게 스레드가 동시에 실행 되어 랜덤으로 출력이 되어 동시성 이슈가 발생을 한다.
        */
        myThread.start(); // 스레드 시작
        myThread1.start(); // 스레드 시작
        myThread2.start(); // 스레드 시작
        myThread3.start(); // 스레드 시작
        myThread4.start(); // 스레드 시작

        //Runnable 인터페이스 구현 방법
        Thread thread1 = new Thread(new MyRunnable(1));
        Thread thread2 = new Thread(new MyRunnable(2));
        Thread thread3 = new Thread(new MyRunnable(3));
        Thread thread4 = new Thread(new MyRunnable(4));
        Thread thread5 = new Thread(new MyRunnable(5));

        thread1.start(); // 스레드 시작
        thread2.start(); // 스레드 시작
        thread3.start(); // 스레드 시작
        Thread.sleep(10000); //10초 지연으로 Blocked 상태를 만듬
        thread4.start(); // 스레드 시작
        thread5.start(); // 스레드 시작
    }
}
