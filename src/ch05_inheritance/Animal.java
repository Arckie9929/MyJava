package ch05_inheritance;

public class Animal {
    String name;
    int age;
    String food; // 먹이

    // eat(), bark()

    public void Display(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    public void eat(){
        System.out.println(name+"이(가) "+food+"을(를) 먹습니다.");
    }

    public void bark(){
        System.out.println(name+"이(가) 짖습니다.");
    }

    @Override
    public String toString() {
        // 메소드 은닉화 : 오버라이딩시 본의 아니게 부모 메소드 접근이 막히는 현상
        String imsi = "이름 : " + name + ", 나이 : " + age + ", 먹이 : "+ food;
        return imsi;
    }
}
