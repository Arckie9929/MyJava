package ch02_control_statement;

public class If02 {
    static void main(String[] args) {
        // 짝수이면 '하하하'를 홀수이면 '호호호'를 출력해주세요.
        int num = 3 ;
        if(num % 2 == 0){ // 짝수이면
            System.out.println("하하하");
            System.out.println(num + "는 짝수");
        }
        else{ // 짝수가 아니면
            System.out.println("호호호");
            System.out.println(num+"는 홀수");
        }
    }
}
