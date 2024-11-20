import java.util.*;

public class Cars {

    String carName = "Some Car name";
    String owner = "some owner name";
    String carNumber = "MH";
    boolean isParked = false;
    Date parkingDate = new Date();

    static int totalNoOfCars = 0;

    // static means unchanged | when we use a static keyword in front of any
    // variables / methods the variable/methods is directly owned by the class
    // itself where static keyword has been written

    // constructor : it is a methods which get called whenever a object is created ,
    // it has same name as of it's class
    // there could be parameterised contructor and non-parameterised constructor

    Cars(String carName, String owner, String carNumber) {
        // System.out.println("constructor called !");
        // this keyword is a pointer which points to the data of the same class/scope
        this.carName = carName;
        this.owner = owner;
        this.carNumber = carNumber;

        totalNoOfCars++;

        park();

    }

    void park() {
        System.out.println("car has been parked");
        isParked = true;
    }

    void unPark() {
        System.out.println("car has been un-parked");
        isParked = false;
    }

    void displayCarInfo() {
        System.out.printf("Car Name: %s \nCar Owner : %s \nCar No. : %s \n", carName, owner, carNumber);
        System.out.println("Car was parked on : " + parkingDate);
        System.out.println("is car parked ?");
        if (isParked) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void displayTable(Cars carsObjects[]) {

        System.out.println("Car Name ---------- Car Owner ---------- Car No. ---------- date ---------- Is Parked");

        for (int i = 0; i < carsObjects.length; i++) {

            System.out.println(carsObjects[i].carName + " ---------- "+ carsObjects[i].owner + " ---------- "+ carsObjects[i].carNumber + " ---------- " + carsObjects[i].parkingDate + " ---------- " + carsObjects[i].isParked);

        }

        System.out.println("table function");
    }

}
