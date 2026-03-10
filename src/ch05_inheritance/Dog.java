package ch05_inheritance;

public class Dog extends Animal {
    boolean guide; // 안내견 여부

    @Override // 이 메소드는 오버라이딩되었습니다.
    public void Display() {
        super.Display();
        if(guide){
            System.out.println("안내견 여부 : 적합");
        }
        else{
            System.out.println("안내견 여부 : 부적합");
        }
    }

    @Override
    public void bark() {
        System.out.println(super.name+ "이(가) 멍멍하고 짖습니다.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
