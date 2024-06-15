package weekly.ex2;

public class Clothing extends Product{
    private int size; //의류사이즈

    public Clothing(String name, int price, int stock, int size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public void calculatePrice() {
        if(size >= 100) {
            int addPrice = super.getPrice() / 10;
            System.out.println("===============================");
            System.out.println("입력 금액 = " + super.getPrice());
            System.out.println("10% 추가 금액 = " + addPrice);
            System.out.println("가격 10% 추가 한 합산 가격 = " + (super.getPrice() + addPrice) + "원입니다.");
        } else {
            super.calculatePrice();
        }
    }



}
