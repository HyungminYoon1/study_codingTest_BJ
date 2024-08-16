package day240809;

import java.util.Scanner;

public class No11050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int n = Integer.parseInt(inputStr.split(" ")[0]);
        int k = Integer.parseInt(inputStr.split(" ")[1]);
        int numerator = 1;
        int denominator = 1;
        for (int i = n; i > n-k; i--) {
            numerator = numerator * i;
        }
        for (int i = 1; i < k+1; i++) {
            denominator = denominator * i;
        }
        System.out.println(numerator/denominator);
    }
}
