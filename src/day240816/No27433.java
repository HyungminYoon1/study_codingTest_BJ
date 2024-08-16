package day240816;

import java.util.Scanner;

public class No27433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long result = 1;
        for (int i = 1; i < n+1; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
