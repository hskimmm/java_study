package pattern.singleton;

public class Signleton {
    private static Signleton instance;

    private Signleton() {
    }

    public static Signleton getInstance() {
        if(instance == null) {
            instance = new Signleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is a Singleton!");
    }
}
