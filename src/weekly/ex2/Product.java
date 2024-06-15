package weekly.ex2;

public class Product {
    private String name; //상품명
    private int price; //상품가격
    private int stock; //상품재고량

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void calculatePrice(){
        System.out.println("===============================");
        System.out.println("상품 가격 = " + price);
    }
}