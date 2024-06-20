package thread;

public class MyThread extends Thread{
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        //스레드가 수행할 코드
        System.out.println(this.name);
    }
}
