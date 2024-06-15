package weekly.ex2;

public class WeeklyQuiz {
    public static void main(String[] args) {
        Clothing clothing = new Clothing("김형섭", 33333, 10, 100);
        clothing.calculatePrice();

        Electronics electronics = new Electronics("김형섭", 34853, 3, "Apple");
        electronics.calculatePrice();

        Food food = new Food("김형섭", 34853, 3, 5);
        food.calculatePrice();

        ShoppingMall shoppingMall = new ShoppingMall(4);
    }
}

