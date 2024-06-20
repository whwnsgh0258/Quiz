package Weekly2;

public class PremiumShoppingMall extends ShoppingMall {

    public PremiumShoppingMall(int size) {
        super(size);
    }

    //@Override
    public boolean checkOrderAvailability() {
        for(Product product : getProductArray()){
            if (product != null && product.getStock() < 10){
                return false;
            }
        }return true;
    }
}
