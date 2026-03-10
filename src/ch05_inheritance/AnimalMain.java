package ch05_inheritance;

public class AnimalMain {
    static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름()

        Dog retriver = new Dog();
        retriver.name = "김리트리버";
        retriver.age = 2;
        retriver.guide = false;
        retriver.food = "사료";
        retriver.Display();
        retriver.eat();
        retriver.bark();

        System.out.println("객체정보");
        System.out.println(retriver.toString());

        Dog maltese = new Dog();
        maltese.name = "이말티즈";
        maltese.age = 7;
        maltese.guide = true;
        maltese.food = "고기";
        maltese.Display();
        maltese.eat();
        maltese.bark();

        Cat persian = new Cat();
        persian.name = "고자";
        persian.age = 3;
        persian.indoor = true;
        persian.food = "습식";
        persian.Display();
        persian.eat();
        persian.bark();

        Cat siamese = new Cat();
        siamese.name = "냐옹이";
        siamese.age = 7;
        siamese.indoor = true;
        siamese.food = "로얄캐닌";
        siamese.Display();
        siamese.eat();
        siamese.bark();
    }
}
