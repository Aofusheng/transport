package com.company;

import person.Person;
import transports.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person a = new Person();
        a.setID("XXX");

        Aircraft a_aircraft = new Aircraft();
        a_aircraft.setID("飞机");
        a_aircraft.setVehicle_Brand("Gulfstream");
        System.out.println(a.getID()+"驾驶着"+a_aircraft.getVehicle_Brand()+a_aircraft.getID());
        a.Drive(a_aircraft);

        System.out.println("\n");

        Ship s_ship = new Ship();
        s_ship.setID("轮船");
        s_ship.setVehicle_Brand("K.Line");
        System.out.println(a.getID()+"驾驶着"+s_ship.getVehicle_Brand()+s_ship.getID());
        a.Drive(s_ship);

        System.out.println("\n");

        Train t_train = new Train();
        t_train.setID("火车");
        t_train.setVehicle_Brand("HTACHI");
        System.out.println(a.getID()+"驾驶着"+t_train.getVehicle_Brand()+t_train.getID());
        a.Drive(t_train);


    }
}
