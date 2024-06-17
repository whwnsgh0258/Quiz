package Weekly2;

import java.util.Scanner;

public class ShoppingMall {
    private Product[] productArray;
    private int productArraySize;

    public ShoppingMall(int size) {
        this.productArray = new Product[size];
        this.productArraySize = 0;
    }

    public void addProduct(Product product) {
        if (this.productArraySize == this.productArray.length){
            Product[] newProductArray = new Product[this.productArraySize * 2];
            System.arraycopy(productArray, 0, newProductArray, 0, this.productArray.length);
            this.productArray = newProductArray;
        }this.productArray[this.productArraySize++] = product;
    }

    public void displayProducts() {
        for (int i = 0; i < this.productArraySize; i++) {
            Product product = this.productArray[i];
            System.out.println("Name: " + product.getName() + " Price: " + product.calculatePrice() + " Stock: " + product.getStock());
        }
        System.out.println();
        System.out.println("\n장바구니에 " + productArraySize + "개의 상품이 있습니다.");
    }
}
