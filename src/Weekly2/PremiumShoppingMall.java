package Weekly2;

public class PremiumShoppingMall extends ShoppingMall {
    public PremiumShoppingMall(int size) {
        super(size);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        return product.getStock() >= 10;
    }
}
