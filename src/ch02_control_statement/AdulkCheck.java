package ch02_control_statement;

public class AdulkCheck {
    static void main(String[] args) {
        String name = "김철수";
        int age = 12;
        int gender = 3;
        String genderS = "";
        String iselder = "";

        if (age >= 19) {
            iselder = "성인";
        } else {
            iselder = "미성년자";
        }

        if (gender == 1 || gender == 3) {
            genderS = "남자";
        } else if (gender == 2 || gender == 4) {
            genderS = "여자";
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        // println 메소드 : 문자열을 출력하고, 엔터키를 누름.
        // 메소드 = 역할 = 기능 = 함수
        System.out.println("이름 : " + name + ", 나이 : " + age);

        // 서식 지정자 :  %s(string, 문자열) %d(decimal, 10진법 정수)
        // printf 메소드 : 서식 지정자를 이용한 출력, 엔터키 기능 없음
        // System.out.printf("이름 : %s, 나이 : %d", name, age)
        System.out.printf("이름 : %s, 나이 : %d,  성별 : %s, 성인여부 : %s", name, age, genderS, iselder);

    }
}
