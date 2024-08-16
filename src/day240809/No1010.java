package day240809;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCountInt = Integer.parseInt(scanner.nextLine().trim());
        List<String> numList = new ArrayList<>();
        for (int i = 0; i < inputCountInt; i++) {
            numList.add(scanner.nextLine().trim());
        }

        for (int i = 0; i < inputCountInt; i++) {
            String[] inputs = numList.get(i).split(" ");
            long n = Long.parseLong(inputs[0]);
            long m = Long.parseLong(inputs[1]);
            long numerator = 1;
            long denominator = 1;
            for (long j = 0; j < n; j++) {
                numerator *= (m - j);
            }
            for (long j = 1; j <= n; j++) {
                denominator *= j;
            }
            System.out.println(numerator / denominator);
        }
    }
}