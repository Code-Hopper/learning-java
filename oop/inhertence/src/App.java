public class App {
    public static void main(String[] args) throws Exception {
        
        birds b1 = new birds("bird", 2, 2, "brown", "sparrow", "pata nahi");

        birds b2 = new birds("bird", 2, 2, "brown", "sparrow1", "pata nahi");

        birds b3 = new birds("bird", 2, 2, "brown", "sparrow2", "pata nahi");

        dogs d1 = new dogs("domastic animal", 4, 0, "white", "tommy", "indian");


        System.out.println(b1.name);

        b1.eat();
        b1.sleep();
        b1.fly();

        b2.eat();
        b2.sleep();
        b2.fly();

        b3.eat();
        b3.sleep();
        b3.fly();

        d1.eat();
        d1.sleep();
        // d1.fly();

        System.out.println("total no of animals : " +animals.totalAnimals);
    }
}
