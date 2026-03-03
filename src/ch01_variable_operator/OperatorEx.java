package ch01_variable_operator;

public class OperatorEx {
    static void main() {
        int a = 3 - -2, b = 3; // a = 5, b =3
        int x = (a >= b) ? 5 : (a+2); // x = 5

        x+= ++a; // x = x + (++a) , x = 11
        System.out.println(a);

        int y = ++a; // y = 7
        System.out.println(a);

        y += a+ --b; // y = y + a + --b;
        System.out.println("바뀐 y : "+y);

        char ch3 = 'D';
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x+2; // z = 14, y = 14;
        System.out.println(z);

        int result = 0;
        result = x > y ? z-y:x+z;
        System.out.println(result);

        // System.out.println(result);
    }
}
