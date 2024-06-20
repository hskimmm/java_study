package thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 스레드가 수행할 코드
        System.out.println("Runnable run");
    }
}
