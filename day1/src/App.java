import java.lang.*;

public class App {
    public static void main(String[] args) {
        // statements| input | output
        // System.out.println("Hello java Using ln");
        // System.out.print("1). Hello java Using without ln");
        // System.out.print("2). Hello java Using without ln");
        // System.out.printf("");
        // print in formated structure

        // variables in java

        int a = 21;
        int b = 22;
        int c = 23;

        float pi = (float) 3.142;
        // type casting[]

        double bigPi = 3.142738;

        boolean option = true;

        char value = 'a';

        String name = "amey";
        // import java.lang.*(everything);

        // printf("the value of a is %d",a);
        // concatination | joining 2 or more "string" may be with a variable also
        System.out.println("the value of a is " + a + " !");
        System.out.println("the value of b is " + b + " !");
        System.out.println("the value of c is " + c + " !");

        // System.out.println("the sum of a and b is "+a+b+" !");
        System.out.println("the sum of a and b is " + (a + b) + " !");

        System.out.println("my name is " + name);

        // oprators
        // airthmatic(+ - * / % ), logical (&&, ||), conditional ( < > <= >= != == ===)
        // , increement (++value, value++), decreement(--value, value--), assignment(=)

        // int data1 = 1;
        // int data2 = 2;

        // float answer = (float) data1 % data2;

        // System.out.println(answer);

        // increement and decreement

        // int data3 = 1;

        // data3++;

        // // first value is going to be 1
        // System.out.println("value before increement is : " + data3);

        // // next value is going to be 2
        // System.out.println("value after increement is : " + data3);


        // for(int i = 0 ; i <  5; ++i){
        //     System.out.println(i);
    
        // }

        int x = 1;

        int a1 = ++x;
        // int b1 = x++;

        System.out.println(a1);
        // System.out.println(b1);

    }

}