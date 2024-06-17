package generic;

/*
    Box<T> -> <T> 는 타입을 뜻한다.
    그래서 Box<?> -> ?에 선언한 타입에 따라 밑의 제너릭의 타입이 모두 적용이 된다.
    ex) public class Box<String>
        private String t;

        public void set(String t) {
            this.t = t;
        }

        public String get() {
            return this.t;
        }
*/
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}
