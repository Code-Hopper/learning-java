public class bike extends vehical {

    String bike_name = "";

    bike(String owner_name, String bike_name){
        super(owner_name);
        this.bike_name = bike_name;
    }

    void go(){
        System.out.println(owner_name+"'s "+ bike_name + " is going !");
    }

}