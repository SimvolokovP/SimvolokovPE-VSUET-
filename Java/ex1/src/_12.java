import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        range(firstNumber, secondNumber);
    }
    public static void range(int a, int b) {
        int min = 0;
        int max = 0;
        if (a < b) {
            min = a;
            max = b;
        }
        else {
            min = b;
            max = a;
        }
        for (int i = min; i <= max; i +=min) {
            System.out.println(i*i);
        }
    }
}
