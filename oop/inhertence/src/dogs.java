public class dogs extends animals {

    String breed = "";

    dogs(String type, int legs, int wings, String color, String name, String breed) {
        super(type, legs, wings, color, name);
        this.breed = breed;
    }

    void run() {
        System.out.println(name + " dog is running !");
    }

}
