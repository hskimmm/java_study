package interfaces.ex3;

public interface Car extends Tier, Engine, Navi{
    String carName();

    //디폴트 메소드는 구현하지 않아도 된다.
    default void showDefault() {
        System.out.println("default method Show");
    }
}
