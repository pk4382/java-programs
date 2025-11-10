import java.util.*;
import java.io.*;
import java.util.Scanner;

public class percentagecalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks : ");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = num1 + num2 + num3;

        float percentage = (float) ((num4 / 300) * 100);
        System.out.println("Your Percentage is : " + percentage);

        float CGPA = (float) (percentage / 9.5);
        System.out.println("Your CGPA based on your percentage is : " + CGPA);
    }

}
