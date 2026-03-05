package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {
/*
이름 : ForSwitch01
for 구문과 switch 구문을 사용하여 1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구해주세요.
*/
        int odd = 0, even =0; // 홀짝 변수 선언
        int total = 0; // 합계 변수 선언

        for (int i = 1; i < 11; i++) {
            switch(i){
                case 1: case 3: case 5: case 7: case 9:
                    odd += i;
                    break;
                case 2: case 4: case 6: case 8: case 10:
                    even += i;
                    break;
                default:
                    break;
            }
        }

        System.out.println("1부터 10까지의 정수 중 홀수의 합은 "+odd+"입니다.");
        System.out.println("1부터 10까지의 정수 중 짝수의 합은 "+even+"입니다.");

    }
}
