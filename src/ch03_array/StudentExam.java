package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score[] = new int[3];
        double _score = 0;
        double avg = 0.0;
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();

        for (int i = 0; i < score.length ; i++) {
                System.out.print("점수 입력 : ");
                score[i] = scan.nextInt();
                avg += score[i];
        }
            _score = avg;
            avg /= 3.0;

        System.out.println("학생의 정보");
        System.out.printf("이름 : %s, 총점 : %.2f, 평균 : %.2f", name, _score, avg);
    }
}
