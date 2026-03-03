package ch01_variable_operator;

public class CondOper {
    static void main() {
        int x = 3, y = 8, z = 4;
        int max = y > x && y > z ? y : z;

        System.out.println("3개의 정수 중에서 가장 큰 숫자를 구해봅니다.");
        System.out.println("예를 들어서 "+x+","+y+","+z+"중 최대의 정수는 "+max+"입니다.");
    }
}
