package ch02_control_statement;

public class SumOneToN {
    static void main(String[] args) {
/*
이름 : SumOneToN
1부터 n까지의 정수를 총합을 구하는 프로그램을 작성해 보세요.
int n = 5 ;

예시:
1부터 5까지의 총합은 15입니다.
*/
        int n = 5;
        for (int i = 1 ; i < 5; i++) {
            n += i;
        }
        System.out.println("1부터 5까지의 총합은 "+n+"입니다.");
    }
}
