public class App {
    public static void main(String[] args) {

        // class it is group of elements/data which have same properties and methods
        // object/instance it has all the properties and methods from the cars class

        Cars car1 = new Cars("Dzire","Amey","MH49CD8914");

        Cars car2 = new Cars("eco-sports","Arnav","MH14DX7536");

        Cars CarsObjects[] = {car1,car2};

        // car1.displayCarInfo();

        car1.displayCarInfo();

        System.out.println("--------------------------X----------------------------");

        // car2.displayCarInfo();

        car2.displayCarInfo();

        car2.unPark();

        System.out.println("Total No. of cars is : " +  Cars.totalNoOfCars);

        Cars.displayTable(CarsObjects);

    }
}
