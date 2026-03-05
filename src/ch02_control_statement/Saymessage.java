package ch02_control_statement;

public class Saymessage {
    static void main(String[] args) {
/*이름 : Saymessage
"안녕하세요."라는 문구를 5번 출력해 보세요.
String message = "안녕하세요.";
int su = 5 ;

예시:
안녕하세요.
안녕하세요.
안녕하세요.
안녕하세요.
안녕하세요.
*/
        String message = "안녕하세요.";
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
