package ch02_control_statement;

import java.util.Scanner;

public class While04 {
    static void main(String[] args) {
        int total = 0;
        double average = 0.0;
        int counter = 0;

        Scanner scan = new Scanner(System.in);

                while(true){
                    System.out.println("정수를 입력해주세요");
                    int jumsu = 0;

                    if(jumsu < 0){
                        System.out.println("음수이므로 종료합니다.");
                        break;
                    }
                    counter++;
                    total += jumsu;
                }
        System.out.println("총합 : " + total);
        System.out.println("평균 : " + ((double)total/counter));
    }
}
