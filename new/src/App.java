import java.util.*;
import java.lang.String;

public class App {

    // to create a function the syntax is

    // no agrs and no returns
    public static void doSomething() {
        System.out.println("this is doSomething function/method");
    }

    // args and return
    public static String sayHi(String name, int age) {

        System.out.println("hi !" + name + ". you are " + age + " years old");

        return "this is return";
    }

    // method / function overloading

    public static int fun(int a) {
        System.out.println("this is fun it has a ");
        return 0;
    }

    public static int fun(int a, int b) {
        System.out.println("this is fun it has a and b");
        return 0;
    }

    public static int fun(int a, int b, int c) {
        System.out.println("this is fun it has a , b and c");
        return 0;
    }

    public static String fun(int a, int b, int c, int d) {
        System.out.println("this is fun this has a , b, c and d");
        return "this is return";
    }

    public static void main(String[] args) {

        // takling user inputs

        // to use a scanner we have to create a scanner object

        Scanner scanner = new Scanner(System.in);

        // for int input12
        // System.err.println("Enter a value !");
        // int data = scanner.nextInt();

        // for float input
        // System.err.println("Enter a value !");
        // float data = scanner.nextFloat();

        // for int string
        // System.err.println("Enter a value !");
        // String data = scanner.nextLine();

        // methods -> functions
        // no args and no return
        // args and return
        // no args and return
        // args and no return

        // overridded
        // overloaded

        doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();

        String WhatFunctionHasReturn = sayHi("amey khondekar", 22);

        System.out.println(WhatFunctionHasReturn);

        fun(10);

        fun(10, 20, 30);

    }

}
