package transports;

public class Transport_main {
    public String ID;
    public String Vehicle_Brand;

    public void vehicle_drive_method(){
        System.out.println("驾驶方法:交通工具的驾驶方法");
    }


    public Transport_main(String ID, String vehicle_Brand) {
        this.ID = ID;
        Vehicle_Brand = vehicle_Brand;
    }
    public Transport_main(){

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getVehicle_Brand() {
        return Vehicle_Brand;
    }

    public void setVehicle_Brand(String vehicle_Brand) {
        Vehicle_Brand = vehicle_Brand;
    }

}