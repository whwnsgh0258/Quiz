package Weekly2;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate expirationDate = LocalDate.of(2024, 06, 30);


        Cloth cloth = new Cloth("공대생 셔츠", 15000, 20);
        Electronics electronics1 = new Electronics("Mac", 1000000, 10);
        Food food = new Food("바나나 한송이", 10000, 5, expirationDate);



        PremiumShoppingMall premiumShoppingMall = new PremiumShoppingMall(10) {
        };

        premiumShoppingMall.addProduct(cloth);
        premiumShoppingMall.addProduct(electronics1);
        premiumShoppingMall.addProduct(food);
        premiumShoppingMall.displayProducts();
        System.out.println(premiumShoppingMall.checkOrderAvailability());
    }
}
