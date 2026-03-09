package ch04_class;

public class ExProduct {
    private String VehicleType;
    private String VehicleName;
    private String VehicleBrandName;
    private String VehicleSegmentation;
    private String VehicleDriveType;
    private String VehicleFuelType;
    private double VehicleConsumption;
    private int VehiclePrice;
    private String VehicleReleaseDate;

    public void CarInfo(){
        System.out.println("출시년도 : "+VehicleReleaseDate);
        System.out.println("차종 : " + VehicleType);
        System.out.println("브랜드 : " + VehicleBrandName);
        System.out.println("차명 : "+ VehicleName);
        System.out.println("등급 : "+ VehicleSegmentation);
        System.out.printf("가격 : %,d원(VAT 포함)%n", VehiclePrice);
        //System.out.println("연비 : "+ VehicleConsumption +"km/l");
        System.out.printf("연비 : %.1fkm/l%n",VehicleConsumption);
        System.out.println("연료방식 : "+ VehicleFuelType);
        System.out.println("구동방식 : " + VehicleDriveType);
    }

    // GET
    public String getVehicleReleaseDate(){
        return VehicleReleaseDate;
    }
    public String getVehicleType(){
        return VehicleType;
    }
    public String getVehicleBrandName(){
        return VehicleBrandName;
    }
    public String getVehicleName(){
        return VehicleName;
    }
    public String getVehicleSegmentation(){
        return VehicleSegmentation;
    }
    public int getVehiclePrice(){
        return VehiclePrice;
    }
    public double getVehicleConsumption(){
        return VehicleConsumption;
    }
    public String getVehicleFuelType(){
        return VehicleFuelType;
    }
    public String getVehicleDriveType(){
        return VehicleDriveType;
    }

    // SET
    public void setVehicleReleaseDate(String _VehicleReleaseDate){
        VehicleReleaseDate = _VehicleReleaseDate;
    }
    public void setVehicleType(String _VehicleType){
         VehicleType = _VehicleType;
    }
    public void setVehicleBrandName(String _VehicleBrandName){
        VehicleBrandName = _VehicleBrandName;
    }
    public void setVehicleName(String _VehicleName){
        VehicleName = _VehicleName;
    }
    public void setVehicleSegmentation(String _VehicleSegmentation){
        VehicleSegmentation = _VehicleSegmentation;
    }
    public void setVehiclePrice(int _VehiclePrice){
        VehiclePrice = _VehiclePrice;
    }
    public void setVehicleConsumption(double _VehicleConsumtion){
        VehicleConsumption = _VehicleConsumtion;
    }
    public void setVehicleFuelType(String _VehicleFuelType){
        VehicleFuelType = _VehicleFuelType;
    }
    public void setVehicleDriveType(String _VehicleDriveType){
        VehicleDriveType = _VehicleDriveType;
    }
}
