package day240924.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        br.close();
        int score = Integer.parseInt(inputStr);
        if(score >= 90 && score <= 100) {
            System.out.println("A");
        }else if(score >= 80 && score < 90) {
            System.out.println("B");
        }else if(score >= 70 && score < 80) {
            System.out.println("C");
        }else if(score >= 60 && score < 70) {
            System.out.println("D");
        }else if(score < 60) {
            System.out.println("F");
        }
    }
}
