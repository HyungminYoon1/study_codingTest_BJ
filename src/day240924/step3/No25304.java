package day240924.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalTransactionAmount = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int calculateTotalTransactionAmount = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int price = Integer.parseInt(input.split(" ")[0]);
            int amount = Integer.parseInt(input.split(" ")[1]);
            calculateTotalTransactionAmount += price * amount;
        }
        br.close();

        if (calculateTotalTransactionAmount == totalTransactionAmount) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
