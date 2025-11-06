import java.io.*;
import java.util.*;
import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, largestNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 >= num2) {

            if (num1 >= num3)

                largestNumber = num1;

            else

                largestNumber = num3;

        } else {

            if (num2 >= num3)

                largestNumber = num2;

            else

                largestNumber = num3;

        }
        System.out.println("Largest number = " + largestNumber);

        scanner.close();

    }
}
