package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import base.Location;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("EM101",150);
        bikes[1] = new Bike("BS999",200);
        bikes[2] = new Bike("SN250",225);

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        person[0]= new Person("Jakarin", "Chaibubpa");
        person[1]= new Person("Chanunporn", "Pongsri");
        person[2]= new Person("Chanon", "Rakdee");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
      
parcels[0] = new Parcel(20.0,ParcelStatus.READY_TO_SHIP,new Location(2.0,11.0));
        parcels[1] = new Parcel(20.0,ParcelStatus.DELIVERED,new Location(21.0,1.0));
        parcels[2] = new Parcel(20.0,ParcelStatus.SHIPPING,new Location(218.0,11.0));
        parcels[3] = new Parcel(20.0,ParcelStatus.SHIPPING,new Location(295.0,61.0));
        parcels[4] = new Parcel(20.0,ParcelStatus.READY_TO_SHIP,new Location(2.0,11.0));
        parcels[5] = new Parcel(20.0,ParcelStatus.READY_TO_SHIP,new Location(2.0,11.0));
        parcels[6] = new Parcel(20.0,ParcelStatus.DELIVERED,new Location(2.0,11.0));
        parcels[7] = new Parcel(20.0,ParcelStatus.DELIVERED,new Location(2.0,11.0));
        parcels[8] = new Parcel(20.0,ParcelStatus.READY_TO_SHIP,new Location(2.0,11.0));
        parcels[9] = new Parcel(20.0,ParcelStatus.DELIVERED,new Location(2.0,11.0));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
