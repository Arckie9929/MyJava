package ch01_variable_operator;

public class Operator_test01 {
    static void main() {
        int a = 10, b = 8;

        boolean bool1 = a != b;
        boolean bool2 =  --a == b++;

        boolean bool3 = a++ != --b;

        boolean bool4 = bool3 && (5>7);
        boolean bool5 = !bool4 || (bool1 && bool2);

        System.out.println("bool 1 : "+bool1);
        System.out.println("bool 2 : "+bool2);
        System.out.println("bool 3 : "+bool3);
        System.out.println("bool 4 : "+bool4);
        System.out.println("bool 5 : "+bool5);
    }
}
