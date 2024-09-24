package day240924.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        br.close();
        int a = Integer.parseInt(inputString.split(" ")[0]) ;
        int b = Integer.parseInt(inputString.split(" ")[1]);
        System.out.println(a*b);
    }
}
