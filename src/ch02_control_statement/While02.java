package ch02_control_statement;

import org.w3c.dom.ls.LSOutput;

public class While02 {
    static void main(String[] args) {
/*
while 구문과 switch 구문을 사용하여 1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구해주세요.
int odd = 0, even = 0 ;
*/
        int i = 1;
        int odd = 0, even = 0;
        while(i<=10){
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
            i++;
        }
        System.out.println("1부터 10까지의 홀수의 합은 "+odd+"입니다.");
        System.out.println("1부터 10까지의 짝수의 합은 "+even+"입니다.");
    }
}
