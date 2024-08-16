package day240809;

import java.util.Scanner;

public class No1010_gpt {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long combination(int m, int n) {
        return factorial(m) / (factorial(n) * factorial(m - n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            System.out.println(combination(m, n));
        }

        scanner.close();
    }
}
