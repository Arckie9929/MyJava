package ch04_class;

public class Product {
        String name ; // 상품명
        int price; //가격
        String inputdate; // 입고일자

        // 정수 1개를 입력 받아서 더하기 5를 수행하고 값을 반환합니다.
        // 반환 타입 메소드 이름(매개 변수 리스트){...}

        int plus5(int x){
                return x + 5 ;
        }

        String showData01(){
                String result = "상품명 : "+ name + " 단가 : "+price+" 입고일 : "+inputdate;
                return result;
        }

        void Display(){
                System.out.println("상품 정보 출력");
                System.out.println("이름 : " + name);
                System.out.println("단가 : " + price);
                System.out.println("입고 : " + inputdate);
        }
}
