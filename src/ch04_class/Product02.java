package ch04_class;

public class Product02 {
    // 멤버변수는 타입별로 기본 값이 있습니다.
    // 멤버변수들은 각기 변수마다 각자 자기자신의 기본값이 있음.
    // 문자열(null), 정수 (0), 실수(0.0) Class의 기본값은 Null임, boolean은 FALSE
    private String name ; // 상품명
    private int price; //가격
    String inputdate;// 입고일자
    static String brand;

    public int getPrice(){
        return price;
    }

    public void setPrice( int price ){

        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){ // 매개변수는 지역변수의 부분 집합입니다.
        this.name = name;
    }
}
