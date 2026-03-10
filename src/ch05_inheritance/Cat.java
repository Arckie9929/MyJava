package ch05_inheritance;
// 상속을 해주는 Animal 클래스는 Dog 클래스가 상속을 받습니다.
// class 서브클래스 extends 수퍼클래스
// 수퍼클래스 = 부모 클래스
// 서브클래스 = 자식 클래스
public class Cat extends Animal {
    boolean indoor; // 애완, 길고양이 여부

    @Override
    public void Display() {
        super.Display();
        if(indoor){
            System.out.println("애완묘 : O");
        }
        else{
            System.out.println("애완묘 : X");
        }
    }

    @Override
    public void bark() {
        System.out.println(super.name +"이(가) 냐옹하고 웁니다.");
    }
}
