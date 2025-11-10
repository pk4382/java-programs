import java.util.*;
import java.io.*;
import java.util.Scanner;

public class kilometertomiles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KiloMeters : ");
        float kl = sc.nextFloat();
        float miles = (float) (kl * 0.62137119);
        System.out.println(kl + " KiloMeters = " + miles + " Miles");
    }
}
