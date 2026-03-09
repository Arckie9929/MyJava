package ch04_class;

public class ProductMain02 {
    static void main() {
        // static은 모든 객체들이 공유할 목적으로 사용되는 변수입니다.
        // 클래스 이름으로 접근이 가능하며 클래수 변수 라고 부릅니다.

        Product02.brand = "고자라니";
        Product02 shin = new Product02();

        shin.setName("신라면"); // 간접쓰기
        shin.setPrice(1000); // 간접 쓰기
        shin.inputdate = "2026-03-01";
        System.out.println(shin.getName());
        System.out.println(shin.getPrice());

        System.out.println(shin.brand);
    }
}
