package Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N for Nth smallest number: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[500];
        Random rand = new Random();
        for (int i = 0; i < 500; i++) {
            arr[i] = rand.nextInt(1000);
        }
        
        Arrays.sort(arr);
        System.out.println("The " + n + "th smallest number is: " + arr[n-1]);
    }
}

