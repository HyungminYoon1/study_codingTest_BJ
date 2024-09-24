package day240924.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] parts = inputStr.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if(a>b) System.out.println(">");
        if(a<b) System.out.println("<");
        if(a==b) System.out.println("==");
        br.close();
    }
}
