package person;

import transports.AirTransport_air;
import transports.Airship;
import transports.Transport_main;

public class Person {
    private String ID;

    public void setID(String id){
        this.ID = id;
    }

    public String getID(){
        return ID;
    }

    public void Drive(Transport_main transport_main){
        transport_main.vehicle_drive_method();
    }

}
