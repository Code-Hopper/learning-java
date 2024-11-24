public class App {

    // polymorphism : data(object) can be used in different types

    public static void main(String[] args) throws Exception {

        bike newBike = new bike("amey", "RES350");
        car newCar = new car("amey", "dzire");
        cycle newCycle = new cycle("amey", "hero");

        vehical[] vehicals = { newBike, newCar, newCycle };

        System.out.println(newBike.bike_name);
        System.out.println(newCar.car_name);
        System.out.println(newCycle.cycle_name);

        System.out.println("total no. of vehicals : " + vehical.count);

        for (int i = 0; i < vehicals.length; i++) {
            vehicals[i].go();
        }

    }
}
