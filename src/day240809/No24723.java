package day240809;

import java.util.Scanner;

public class No24723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}
