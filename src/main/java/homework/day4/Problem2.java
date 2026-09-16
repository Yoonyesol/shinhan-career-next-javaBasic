package homework.day4;

import java.util.HashMap;

class Product {
    private int productNo, price;
    private String name;

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Product(int productNo, String name, int price) {
        this.productNo = productNo;
        this.name = name;
        this.price = price;
    }
}

class ProductService {
    private HashMap<Integer, Product> hm = new HashMap<>();

    void addProduct(Product product) {
        hm.put(product.getProductNo(), product);
        System.out.println("상품 등록 완료: " + product.getName());
    }

    Product getProductByNo(int pNo) {
        return hm.get(pNo);
    }

    void deleteProducct(int pNo) {
        if (hm.containsKey(pNo)) {
            hm.remove(pNo);
            System.out.println("상품 삭제 완료");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

    }

    void printProducts(){
        hm.values().forEach(el->
                System.out.println("상품번호: " + el.getProductNo()
                        +", 상품명: "+el.getName() + " 상품가격: "+el.getPrice()));
    }
}

public class Problem2 {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        // 1. 상품 등록
        service.addProduct(new Product(100, "꼬깔콘", 4500));
        service.addProduct(new Product(101, "키보드", 50000));
        service.addProduct(new Product(102, "마우스", 30000));
        service.addProduct(new Product(103, "모니터", 170000));
        service.addProduct(new Product(104, "RAM", 500000));

        // 2. 상품번호로 상품 조회
        Product prd = service.getProductByNo(101);
        System.out.println("상품번호: " + prd.getProductNo()
                +", 상품명: "+prd.getName() + " 상품가격: "+prd.getPrice());

        // 3. 상품 삭제
        service.deleteProducct(102);

        // 4. 전체 상품 출력
        service.printProducts();
    }
}