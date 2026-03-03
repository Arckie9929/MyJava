package ch01_variable_operator;

public class Condition02 {
    static void main(String[] args) {
        int x = 10, y = 20;

        // 2개의 숫자 중에서 큰 수 고르기
        // 타입 result = 조건식 ? 참일때 : 거짓일때 처리;

        int result = x >= y ? x : y;
        System.out.println("RESULT : " + result);

        // x가 짝수인지 홀수인지 판단해보세요.
        String two = (x % 2) == 0 ? "짝수" : "홀수" ;
        System.out.println("결과는 " + two + "입니다.");

        x = 6;

        // x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과 출력하기
        int sq = (x % 3) == 0 ? x * x : x + 5;
        System.out.println("x = " + sq);

        int month = 3;

        String season = month >= 3 &&  month < 6 ? "봄" : "봄이 아님";
        System.out.println(month+"월은 "+season);
    }
}
