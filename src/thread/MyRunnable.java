package thread;

public class MyRunnable implements Runnable{

    private int number;

    public MyRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // 스레드가 수행할 코드
        System.out.println(this.number);
    }
}
