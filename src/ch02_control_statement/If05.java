package ch02_control_statement;

public class If05 {
    static void main(String[] args) {
        int su = 3;
        if(su % 7 ==0) {
            su *= su;
            System.out.println("값 : " + su);
        }
        else if(su % 7 > 0){
            su += 3;
            System.out.println("값 : "+ su);
        }
    }
}
