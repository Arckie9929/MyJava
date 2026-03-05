package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
        // 1부터 10까지의 총합
        /*
            total(생성)    i(생성)
              0                1
              0+1            2
              1+2      3
              3+3      4
              6+4      5
              10+5      6
              15+6      7
              21+7      8
              28+8      9
              36+9      10
              45+10   11(소멸)
              출력
              total(소멸)
        */

        // 1 + 4 + 7 + ... + 100 = 1717

        // 97 + 92 + 87 + ... + 2 = 990
        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670

        int total = 0;

        for (int i = 97; i >= 2; i -= 5) {
            total += i;
            System.out.println("변화값 추적 "+i+" "+total);
        }

        System.out.println("총합01 : "+total);

        int total2 = 0;

        for (int j = 1; j <= 96; j += 5) {
            total2 += j*j;
            System.out.println("변화값 추적 "+j+" "+total2);
        }

        System.out.println("총합01 : "+total2);
    }
}