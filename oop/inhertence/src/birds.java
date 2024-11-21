public class birds extends animals {

    String subType = "";

    birds(String type, int legs, int wings, String color, String name, String subType) {
        super(type, legs, wings, color, name);
        this.subType = subType;
    }

    void fly() {
        System.out.println(name + " bird is flying !");
    }

}