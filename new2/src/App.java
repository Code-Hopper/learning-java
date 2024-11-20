import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("year is leap year !");
            }else{
                System.out.println("year is not a leap year !");
            }
        }else if(year % 4 == 0){
            System.out.println("year is leap year !");
        }else{
            System.out.println("not a leap year !");
        }

    }
}
