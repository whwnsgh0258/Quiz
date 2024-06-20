package Weekly2;

import java.util.Scanner;

public class Cloth extends Product {
    private String size;

    public Cloth(String name, int price, int stock) {
        super(name, price, stock);
    }

    @Override
    public int calculatePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("옷의 사이즈는 XS, S, M, L, XL 가 있습니다.");
        System.out.print("위의 사이즈 중 해당하는 사이즈를 입력해 주세요: ");


        double clothPrice = getPrice();

        while (true) {
            this.size = sc.nextLine();
            if (this.size.equals("L")) {
                clothPrice = clothPrice * 1.1;
                // 상세 정보 출력
                System.out.println("상품명: " + getName());
                System.out.println("가격: " + (int) clothPrice + "원");
                setStock();
                System.out.println("사이즈: " + this.size);
                break;
            } else if (this.size.equals("XS") || this.size.equals("S") || this.size.equals("M") || this.size.equals("XL")) {
                System.out.println("상품명: " + getName());
                System.out.println("가격: " + (int) clothPrice + "원");
                setStock();
                System.out.println("사이즈: " + this.size);
                break;
            } else {
                System.out.print("사이즈를 다시 입력해 주세요: ");
            }
        }
        return super.calculatePrice();

    }

    public String getSize() {
        return size;
    }
}
