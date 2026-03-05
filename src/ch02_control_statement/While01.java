package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0;
        int i = 0;
        int j = 1;
        int k = 97;
        int a = 1;

        while (i < 11) {
            i++;
            total += i;
        }

        System.out.println("총합01 : " + total);

        // 1 + 4 + 7 + ... + 100 = 1717
        total = 0;
        while (j < 101) {
            total += j;
            j += 3;
        }
        System.out.println("총합02 : " + total);

        // 97 + 92 + 87 + ... + 2 = 990
        total = 0;
        while (k >= 2) {
            total += k;
            k -= 5;
        }
        System.out.println("총합03 : " + total);

        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
        total = 0;
        while (a <= 96) {
            total += a*a;
            a += 5;
        }
        System.out.println("총합04 : " + total);
    }
}
