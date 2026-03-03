package ch01_variable_operator;

public class PrintMe {
    static void main() {
        // 이름, 나이, 키, 몸무게, 혈액형, 유형, 진위(True False Boolean)
        // SRING INT INT INT CHAR STRING BOOLEAN

        String name, blood;
        int age; // 나이
        double height, weight; // 키, 몸무게
        char type; // A, B, C TYPE
        boolean bool ;

        name = "홍길동";
        age = 30;
        height = 175.2;
        weight = 65.7;
        blood = "B";
        type = 'B';
        bool = true;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형: " + blood);
        System.out.println("유형 : " + type);
        System.out.println("구독여부 : " + bool);
    }
}

