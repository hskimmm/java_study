package weekly.ex2;

public class Food extends Product{
    private int expirationDate; //음식유통기한

    public Food(String name, int price, int stock, int expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    public void calculatePrice() {
        if(expirationDate <= 7) {
            double discount = super.getPrice() * 0.2;
            System.out.println("===============================");
            System.out.println("입력 금액 = " + super.getPrice());
            System.out.println("20% 할인 가격 = " + Math.round(discount));
            System.out.println("가격 20% 할인 한 합산 가격 = " + Math.round(super.getPrice() - discount) + "원입니다.");
        } else {
            super.calculatePrice();
        }
    }
}
