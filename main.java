import java.util.Scanner;

public class Main {
    public static int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number higher than 0: ");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < num; i++) {
            System.out.println(fib(i));
        }
    }
}
