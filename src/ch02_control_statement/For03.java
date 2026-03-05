package ch02_control_statement;

public class For03 {
    static void main(String[] args) {
        int total = 0;
        // 1 + 2 + 3 + ... + 50 = 1275
        for (int i = 1; i < 51 ; i++) {
            total += i;
        }
        System.out.println("총합00 : "+total);
        // 2 + 4 + 6 + ... + 100 = 2550
        total = 0;
        for (int i = 2; i <= 100 ; i += 2) {
            total += i;
        }
        System.out.println("총합01 : "+total);
        // 1 + 3 + 5 + ... + 99 = 2500
        total = 0;
        for (int i = 1; i < 100; i+=2) {
            total += i;
        }
        System.out.println("총합02 : "+total);
        // 100 + 95 + 90 + ... + 5 = 1050
        // 2제곱 + 4제곱 + 6제곱 + 20제곱 = 1540
        total = 0;
        for (int i = 2; i < 21; i+=2) {
            total += i*i;
        }
        System.out.println("총합03 : "+total);
        // 5제곱 + 10제곱 + 15제곱 + ... + 100제곱 - 71750
        total = 0;
        for (int i = 5; i < 101; i+=5) {
            total += i*i;
        }
        System.out.println("총합04 : "+total);
    }
}
