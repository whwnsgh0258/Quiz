package Weekly2;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate expirationDate = LocalDate.of(2024, 06, 30);


        Cloth cloth = new Cloth("공대생 셔츠", 15000, 20);
        Electronics electronics1 = new Electronics("Mac", 1000000, 10);
        Food food = new Food("바나나 한송이", 10000, 9, expirationDate);


        ShoppingMall shoppingMall = new ShoppingMall(10) {
            @Override
            public boolean checkOrderAvailability(Product product) {
                return false;
            }
        };


        shoppingMall.addProduct(cloth);
        shoppingMall.addProduct(electronics1);
        shoppingMall.addProduct(food);
        shoppingMall.displayProducts();
    }
}
