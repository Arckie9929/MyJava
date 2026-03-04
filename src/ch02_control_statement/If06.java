package ch02_control_statement;

public class If06 {
    static void main(String[] args) {
        int month = 1;

        if(month == 12 || (month <= 1 && month < 3)){
            System.out.println("현재는 겨울입니다.");
        }
        else if(month >= 3 && month <= 5){
            System.out.println("현재는 봄입니다.");
        }
        else if(month >= 6 && month <=8){
            System.out.println("현재는 여름입니다.");
        }
        else if(month >= 9 && month <= 11){
            System.out.println("현재는 가을입니다.");
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }
}
