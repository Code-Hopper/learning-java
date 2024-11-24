public class car extends vehical {

    String car_name = "";

    car(String owner_name, String car_name){
        super(owner_name);
        this.car_name = car_name;
    }

    void go(){
        System.out.println(owner_name+"'s "+ car_name + " is going !");
    }

}