package generic.ex1;

public class Car<T> {
    private T t;

    public void setCarName(T t) {
        this.t = t;
    }

    public T getCarName() {
        return this.t;
    }

    public boolean isIns() {
        return t instanceof Object;
    }
}
