package generic.ex2;

import generic.Box;

public class Util {
    /*
        제너릭 메서드
        반환 타입 -> Box<T>
    */
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
