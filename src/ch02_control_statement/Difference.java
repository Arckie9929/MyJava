package ch02_control_statement;

public class Difference {
    static void main(String[] args) {
/*
이름 : Difference
1부터 50까지의 정수 중에서
int diff = sumA - sumB ;
System.out.println("3의 배수의 총합 : " + sumB ); // 408
System.out.println("3의 배수가 아닌 정수의 총합 : " + sumA ); // 867
System.out.println("차이 : " + diff ); // 459
*/
        int sumA = 0, sumB = 0;

        for (int i = 1; i < 51; i++) {
            if(i % 3 == 0){
                sumB += i;
            }
            else {
                sumA += i;
            }
        }

        int diff = sumA - sumB;
        System.out.println("3의 배수의 총합 : " + sumB ); // 408
        System.out.println("3의 배수가 아닌 정수의 총합 : " + sumA ); // 867
        System.out.println("차이 : " + diff ); // 459
    }
}
