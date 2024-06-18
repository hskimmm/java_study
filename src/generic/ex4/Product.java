package generic.ex4;

public class Product<T,M> {
    private T kind;
    private M modal;


    public T getKind() {
        return kind;
    }

    public M getModal() {
        return modal;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModal(M modal) {
        this.modal = modal;
    }
}
