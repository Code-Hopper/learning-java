public class animals {

    String type = "";
    int legs = 0;
    String color = "";
    int wings = 0;
    String name = "";

    static int totalAnimals = 0;

    animals(String type, int legs, int wings, String color, String name) {
        this.type = type;
        this.legs = legs;
        this.color = color;
        this.wings = wings;
        this.name = name;

        totalAnimals++;
    }

    void eat() {
        System.out.println(name + " Animal is eating !");
    }

    void sleep() {
        System.out.println(name + " Animal is sleeping !");
    }

    void typeOfAnimal() {
        System.out.println("animal is of " + type);
    }

    void displayAnimalInfo() {
        System.out.printf("\nAnimal name is %s \nAnimal is of %s", name, type);
    }

}
