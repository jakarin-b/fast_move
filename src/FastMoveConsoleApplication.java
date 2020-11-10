/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import base.Bike;
import base.Person;
import java.util.Scanner;
import base.Parcel;
import base.ParcelStatus;
import base.Location;

/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {
    Bike bikes;
    Person newPerson1;
    
    public FastMoveConsoleApplication(){
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Enter Your licensePlate");
        String name = scn1.next();
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Enter Your engineCapacity");
        int num = scn2.nextInt();
        this.bikes = new Bike(name,num);
        
        Scanner newFirstName = new Scanner(System.in);
        System.out.println("Enter Firstname :");
        String firstName = newFirstName.nextLine();
        Scanner newLastName = new Scanner(System.in);
        System.out.println("Enter Lastname :");
        String lastName = newLastName.nextLine();
        this.newPerson1 = new Person(firstName, lastName);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width : ");
        double widht = sc.nextDouble();
        System.out.print("Enter latitude : ");
        double latitude = sc.nextDouble();
        System.out.println("Enter longitude : ");
        double longitude = sc.nextDouble();
        Parcel parcel = new Parcel(widht,ParcelStatus.READY_TO_SHIP,new Location(latitude,longitude));
    }
}
