package ch04_class;

public class ProductMain {
    static void main(String[] args) {
        // 단계 02 : 객체생성
        // 생성자 이름은 클래스 이름과 동일해야합니다.
        // 클래스 이름  객체이름 = new 생성자이름();
        Product shin = new Product(); // 신라면, 클래스 이름 첫문자를 대문자로 하는 경향이 있다.

        Product blackbean; // 짜파게티
        blackbean = new Product();

        // 단계03 : 멤버 변수에 값을 할당
        // .은 멤버 참조 연산자라고 부릅니다.

        shin.name = "신라면";
        shin.inputdate = "2026-03-01";
        shin.price = 1000;

        blackbean.name = "짜파게티";
        blackbean.inputdate = "2026-03-02";
        blackbean.price = 1200;

        System.out.println("1번 상품 정보 출력");
        System.out.println("이름 : " + shin.name);
        System.out.println("단가 : " + shin.price);
        System.out.println("입고 : " + shin.inputdate);

        System.out.println("2번 상품 정보 출력");
        System.out.println("이름 : " + blackbean.name);
        System.out.println("단가 : " + blackbean.price);
        System.out.println("입고 : " + blackbean.inputdate);

        int su = 3;
        int result = shin.plus5(su);
        System.out.println("결과 : "+ result);

        String str = shin.showData01();
        System.out.println(str);

        shin.Display();

    }
}
