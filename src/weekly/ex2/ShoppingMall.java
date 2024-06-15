package weekly.ex2;

public abstract class ShoppingMall {
    //4-2까지 완료
    private Product[] products;
    private int productCount;

    public ShoppingMall(int indexSize) {
        products = new Product[indexSize];
        productCount = 0;
    }

    //제품 추가
    public void addProduct(String name, int price, int stock) {
        addProduct(new Product(name, price, stock));
    }

    public void addProduct(Product product) {
        if(productCount == products.length) {
            Product[] copyProducts = new Product[products.length * 2];
            System.arraycopy(products, 0, copyProducts, 0, products.length);
            products = copyProducts;
        }

        products[productCount++] = product;
    }

    public void addProduct(Clothing clothing) {
        addProduct((Product) clothing);
    }

    public void addProduct(Electronics electronics) {
        addProduct((Product) electronics);
    }

    public void addProduct(Food food) {
        addProduct((Product) food);
    }

    //제품 삭제
    public void removeProduct(String name) {
        for(int i = 0; i < productCount; i++) {
            if(products[i].getName().equals(name)) {
                System.arraycopy(products, i + 1, products, i, productCount - i - 1);
                products[--productCount] = null;
            }
        }
    }

    //제품 목록 출력
    public void displayProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println("===============================");
            System.out.println("상품명 = " + products[i].getName());
            System.out.println("상품가격 = " + products[i].getPrice());
            System.out.println("상품 재고량 = " + products[i].getStock());
        }
    }

    public abstract boolean checkOrderAvailability(Product product);
}
