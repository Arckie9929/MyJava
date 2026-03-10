package ch04_class;

public class Product03 {
    private String name; // null

    // 상품의 단가가 입력되지 않으면 500원이라고 가정
    private int price = 500; // 0
    private String inputdate; // ;

    // 기본 생성자 : 눈에는 보이지 않음.
    // 정의 : 객체 생성시 오직 1번만 호출이되는 특수 메소드

    // 생성자 만들기
    // 반환타입 메소드이름(매개변수 리스트){...}
    // 생성자에는 반환타입을 적지 않음
    public Product03(){
        System.out.println("출력을 시험합니다.");
    }

    public Product03(String name, int price, String inputdate){
        this.name = name; // 객체 자신(this)이 소유한 name변수에 매개 변수 name의 값을 할당하시오.
        this.price = price;
        this.inputdate = inputdate;
    }
    public Product03(String name, String inputdate){
        this.name = name; // 객체 자신(this)이 소유한 name변수에 매개 변수 name의 값을 할당하시오.
        this.inputdate = inputdate;
    }

    public void display() {
        System.out.println("상품명 : "+name);
        System.out.println("가격 : "+price);
        System.out.println("입고일자 : "+inputdate);
    }
}
