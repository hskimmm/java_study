package weekly.ex2;

public abstract class ShoppingMall {
    //4-2까지 완료
    private Product[] products;

    public ShoppingMall(int indexSize) {
        products = new Product[indexSize];

        System.out.println(products.length);
    }

    //제품 추가
    private void product(String name, int price, int stock) {

    }

    //제품 삭제
    private void product(String name) {

    }

    //제품 목록 출력
    private void product(String name, int stock) {

    }
}
