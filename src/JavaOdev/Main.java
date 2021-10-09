package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year to find leap year");

        year = scanner.nextInt();

        if(year % 4 == 0 ){
            if(year % 100 == 0 ){
                if ((year % 400 == 0) ){
                    System.out.println( year + " is a leap year");
                }
                else System.out.println(year + " is not a leap year");

            }
            else System.out.println( year + " is a leap year");

        }
        else System.out.println(year + " is not a leap year");

    }
}
