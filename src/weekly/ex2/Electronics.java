package weekly.ex2;

public class Electronics extends Product {
    private String brand; //제품브랜드

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void calculatePrice() {
        if(brand.equals("Apple")) {
            int addPrice = getPrice() / 5;
            System.out.println("===============================");
            System.out.println("입력 금액 = " + getPrice());
            System.out.println("20% 추가 금액 = " + addPrice);
            System.out.println("가격 20% 추가 한 합산 가격 = " + (getPrice() + addPrice) + "원입니다.");
        } else {
            super.calculatePrice();
        }
    }
}
