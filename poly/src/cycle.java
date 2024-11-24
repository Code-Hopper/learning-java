public class cycle extends vehical {

    String cycle_name = "";

    cycle(String owner_name, String cycle_name){
        super(owner_name);
        this.cycle_name = cycle_name;
    }

    void go(){
        System.out.println(owner_name+"'s "+ cycle_name + " is going !");
    }

}