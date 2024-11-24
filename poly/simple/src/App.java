// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {

//         // exception handling
//         Scanner scanner = new Scanner(System.in);

//         try {
//             // code where exception/err might apear

//             int x = scanner.nextInt();
//             int y = scanner.nextInt();

//             int answer = x / y;

//             System.out.println(answer);
            
//         } catch (ArithmeticException e) {
//             System.out.println("you cannot divide any int by 0 !");
//         }

//     }
// }

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // exception handling
    
        int[] array = {1,2,3};

        try {
            // code where exception/err might apear
            System.out.println(array[3]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you cannot access element more than the size of array !");
        }

    }
}

