package ch04_class;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class ExProductMain {
    static void main() {

        // 자동차 정보를 관리하는 프로그램을 생성하기
        int Number;
        int CarNumberArray;
        Scanner scan = new Scanner(System.in);
        /*
         현재 설게 개념.
         순번 입력받아 순번의 배열에 있는 자동차 정보를 입력하는 프로그램.
         #1 순번을 입력함.
         #2 배열에 접근함.
         #3 배열에 내용을 작성함.
         #4 해당 배열에 내용을 저장함.
         #5 배열의 크기는 동적으로 작동해야함. (배열을 새로 생성하고 배열에 있는 자료를 그대로 저장해야함.)
         */
   //     Number = scan.nextInt(); // 배열의 크기는?

            ExProduct productDB = new ExProduct(); // 임시 DB

            System.out.print("입력하고자 하는 순번을 입력하십시오. : ");
            productDB.setVehicleNumber(scan.nextInt());

            System.out.print("차량의 이름은 무엇입니까? : ");
            productDB.setVehicleName(scan.nextLine());

            System.out.print("출시년도는 언제입니까? : ");
            productDB.setVehicleReleaseDate(scan.nextLine());

            System.out.print("차종은 무엇입니까? : ");
            productDB.setVehicleType(scan.nextLine());

            System.out.print("브랜드는 어떤 것입니까? : ");
            productDB.setVehicleBrandName(scan.nextLine());

            System.out.print("차명은 무엇입니까? : ");
            productDB.setVehicleName(scan.nextLine());


        productDB.CarInfo();
    }
}
