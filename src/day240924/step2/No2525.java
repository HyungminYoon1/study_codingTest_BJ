package day240924.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr1 = br.readLine();
        int A = Integer.parseInt(inputStr1.split(" ")[0]);
        int B = Integer.parseInt(inputStr1.split(" ")[1]);
        String inputStr2 = br.readLine();
        int C = Integer.parseInt(inputStr2);
        br.close();

        int additionalHour = (B+C)/60;
        int minutesRemainder = (B+C) % 60;
        int totalHour = A+additionalHour;

        System.out.println(totalHour%24 + " " + minutesRemainder);
    }
}
