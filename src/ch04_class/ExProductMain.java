package ch04_class;

public class ExProductMain {
    static void main() {

        // 자동차 정보를 관리하는 프로그램을 생성하기

        ExProduct productdb = new ExProduct();

        productdb.setVehicleReleaseDate("2009");
        productdb.setVehicleBrandName("BMW");
        productdb.setVehicleName("328i Convertible");
        productdb.setVehicleConsumption(8.5);
        productdb.setVehiclePrice(75250000);
        productdb.setVehicleSegmentation("C");
        productdb.setVehicleType("컨버터블");
        productdb.setVehicleDriveType("후륜구동");
        productdb.setVehicleFuelType("휘발유");

        productdb.CarInfo();

    }
}
