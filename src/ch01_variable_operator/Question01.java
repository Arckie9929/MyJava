package ch01_variable_operator;

public class Question01 {
    static void main() {

        String name;
        double sub_kor, sub_eng, avg;
        name = "홍길동";
        sub_kor = 40.0;
        sub_eng = 43.0;
        avg = (sub_kor + sub_eng) / 2 ;

        System.out.println("이름 : "+ name);
        System.out.println("국어 : "+ sub_kor);
        System.out.println("영어 : "+ sub_eng);
        System.out.println("평균 : "+ avg);
    }
}
