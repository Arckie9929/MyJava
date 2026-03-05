package ch02_control_statement;

public class Gugudan {
    static void main(String[] args) {
/*
이름 : Gugudan
int dan = 3 ;
3단을 출력해는 프로그램 작성

예시:
3 * 1 = 3
3 * 2 = 6
...
3 * 9 = 27
 */
        int dan = 3;
        int answer = 0;

        for (int i = 1; i <= 9; i++) {
            answer = dan * i;
            System.out.println("3 * "+i+" = "+answer);
        }
    }
}
