import java.util.*;
import java.io.*;
import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        
        try {
            Integer.parseInt(input);
            System.out.println(input + " is an integer.");
        } catch (NumberFormatException e) {
            System.out.println(input + " is NOT an integer.");
        }
        
        scanner.close();
    }
}
