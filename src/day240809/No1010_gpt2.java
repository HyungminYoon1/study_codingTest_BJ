package day240809;

import java.util.Scanner;

public class No1010_gpt2 {

    public static long combination(int m, int n) {
        long[][] comb = new long[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= Math.min(i, n); j++) {
                if (j == 0 || j == i) {
                    comb[i][j] = 1;
                } else {
                    comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
                }
            }
        }
        return comb[m][n];
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
