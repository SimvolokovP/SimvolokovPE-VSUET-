package ex5;

import java.util.Scanner;

public class summa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Sum of pow elements of array: " + sum(array));
    }

    public static int sum(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of array: ");
            arr[i] = scanner.nextInt();
            result += Math.pow(arr[i], 2);
        }
        return result;
    }
}
