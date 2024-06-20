package Weekly2;

/**
 * 문제: 온라인 쇼핑몰 시스템 구현하기
 * <br>
 * 요구사항:<br>
 * 1. 상품(Product)이라는 부모 클래스를 생성하고, 자식 클래스로 의류(Clothing), 전자제품(Electronics), 식품(Food)을 생성할 것 (15점)<br>
 * - Product 클래스는 상품명(name), 가격(price), 재고량(stock) 필드를 private로 선언하고, 적절한 생성자와 public getter, setter 메소드를 포함할 것<br>
 * - 각 자식 클래스는 Product를 상속받고, 추가로 의류는 사이즈(size), 전자제품은 브랜드(brand), 식품은 유통기한(expirationDate) 필드를 private로 선언할 것<br>
 * 2. 각 자식 클래스의 생성자에서는 super()를 사용하여 부모 생성자를 호출하고 상품명, 가격, 재고량을 설정하고, 자식 클래스의 독자적인 필드도 설정할 수 있도록 할 것 (15점)<br>
 * 3. Product 클래스에 public으로 가격을 계산하는 calculatePrice() 메소드를 생성하고, 자식 클래스에서 이를 오버라이딩 할 것 (15점)<br>
 * - Product의 calculatePrice()는 가격을 그대로 리턴함<br>
 * - Clothing의 calculatePrice()는 사이즈가 "L" 이상이면 가격에 10%를 추가하여 리턴함<br>
 * - Electronics의 calculatePrice()는 브랜드가 "Apple"이면 가격에 20%를 추가하여 리턴함<br>
 * - Food의 calculatePrice()는 유통기한이 7일 이하로 남았다면 가격에서 20%를 할인하여 리턴함<br>
 * 4. 쇼핑몰 클래스(Weekly2.ShoppingMall)를 생성하고 여러 상품을 담을 수 있는 Product 배열을 필드로 가질 것 (15점)<br>
 * - 생성자에서 매개변수로 받은 크기만큼의 Product 배열을 생성할 것<br>
 * - 제품 추가(addProduct), 제품 삭제(removeProduct), 제품 목록 출력(displayProducts) 기능을 가진 메소드들을 오버로딩으로 생성할 것<br>
 * - 제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고 기존 상품들을 복사한 후 새 상품을 추가할 것<br>
 * 5. ShoppingMall에 public abstract 메소드로 주문 가능 여부를 확인하는 checkOrderAvailability(Product product)를 선언할 것 (15점)<br>
 * - 이를 상속받은 PremiumShoppingMall 클래스를 생성하고 checkOrderAvailability(Product product)를 오버라이딩 할 것<br>
 * - PremiumShoppingMall의 checkOrderAvailability(Product product)는 전달받은 상품의 재고량이 10개 이상일 때만 true를 리턴하고 그 외에는 false를 리턴할 것<br>
 * <br>
 * **실행해서 돌아가는 모습까지 캡처해서 올려주세요!!!**<br>
 * 총 75점 만점입니다.
 */

public class Product {
    // private 필드 선언
    private String name;
    private int price;
    private int stock;

    // 생성자
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock() {
        if (stock < 1) {
            stock = 0;
            System.out.println("재고가 없습니다");
        } else {
            System.out.println("재고: " + getStock() + "개");
        }
    }

    public int calculatePrice() {
        return price;
    }
}
