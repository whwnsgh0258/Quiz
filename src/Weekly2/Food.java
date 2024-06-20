package Weekly2;

import java.time.LocalDate;

public class Food extends Product {
    private LocalDate expirationDate;

    public Food(String name, int price, int stock, LocalDate expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public int calculatePrice() {
        System.out.println("");
        double foodPrice = getPrice();
        if (expirationDate.isBefore(LocalDate.now().plusDays(7))) {
            foodPrice = foodPrice * 0.8;
        }

        System.out.println("상품명: " + getName());
        System.out.println("가격: " + (int) foodPrice + "원");
        setStock();
        System.out.println("유통기한: " + this.expirationDate);
        return super.calculatePrice();
    }

}
