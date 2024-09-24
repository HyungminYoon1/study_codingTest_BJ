package day240924.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] parts = inputStr.split(" ");
        long a = Long.parseLong(parts[0]);
        long b = Long.parseLong(parts[1]);
        long c = Long.parseLong(parts[2]);
        br.close();
        System.out.println(a + b + c);
    }
}
