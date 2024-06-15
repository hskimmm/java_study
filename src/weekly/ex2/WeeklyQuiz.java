package weekly.ex2;

public class WeeklyQuiz {
    public static void main(String[] args) {
        Clothing clothing = new Clothing("반팔", 60000, 10, 95);
        clothing.calculatePrice();

        Electronics electronics = new Electronics("에어팟", 23000, 30, "Apple");
        electronics.calculatePrice();

        Food food = new Food("치킨", 25000, 5, 7);
        food.calculatePrice();

        PremiumShoppingMall  shoppingMall = new PremiumShoppingMall(2);

        shoppingMall.addProduct("과자1", 1000, 3);
        shoppingMall.addProduct("과자2", 2000, 26);
        shoppingMall.addProduct("과자3", 3000, 35);
        shoppingMall.addProduct("과자4", 4000, 26);
        shoppingMall.addProduct("과자5", 3500, 56);
        shoppingMall.addProduct("과자6", 1500, 66);

        shoppingMall.addProduct(clothing);
        shoppingMall.addProduct(electronics);
        shoppingMall.addProduct(food);

        shoppingMall.removeProduct("과자4");

        shoppingMall.displayProducts();

        System.out.println("===============================");
        System.out.println("clothing = " + shoppingMall.checkOrderAvailability(clothing));
        System.out.println("electronics = " + shoppingMall.checkOrderAvailability(electronics));
        System.out.println("food = " + shoppingMall.checkOrderAvailability(food));

    }
}

