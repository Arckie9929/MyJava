package ch02_control_statement;

public class Stars {
    static void main(String[] args) {
        int end = 10;
        for (int i = 0; i < end ; i++) {
            for (int j = (end - 1) - i  ; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1 ; k++) {
                System.out.print("*");
            }
            for (int a = 0; a < i ; a++) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
}



