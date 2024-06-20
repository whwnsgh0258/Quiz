package Weekly2;

import java.util.Scanner;

public class Electronics extends Product {
    private String brand;

    public Electronics(String name, int price, int stock) {
        super(name, price, stock);
    }

    @Override
    public int calculatePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("SamSung 과 Apple 중 선택해 주세요: ");

        double ePrice = getPrice();
        while (true){
            this.brand = sc.nextLine();
            if (this.brand.equals("Apple")) {
                ePrice = ePrice * 1.2;
                System.out.println("상품명: " + getName());
                System.out.println("가격: " + (int) ePrice + "원");
                setStock();
                System.out.println("브랜드: " + this.brand);
                break;
            } else if (this.brand.equals("SamSung")) {
                System.out.println("상품명: " + getName());
                System.out.println("가격: " + (int) ePrice + "원");
                setStock();
                System.out.println("브랜드: " + this.brand);
                break;
            } else {
                System.out.print("브랜드 명을 다시 입력해 주세요: ");
            }
        }
        return super.calculatePrice();
    }
}
