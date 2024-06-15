package weekly.ex2;

public class PremiumShoppingMall extends ShoppingMall{

    public PremiumShoppingMall(int indexSize) {
        super(indexSize);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        return product.getStock() >= 10;
    }
}
