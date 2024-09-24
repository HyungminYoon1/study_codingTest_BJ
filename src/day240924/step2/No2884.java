package day240924.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        br.close();
        int H = Integer.parseInt(inputStr.split(" ")[0]);
        int M = Integer.parseInt(inputStr.split(" ")[1]);

        if (H==0){
            if(M>=0 && M<45) {
                System.out.println(23 + " " + (M + 15));
            }
            if(M>=45 && M<60) {
                System.out.println(0 + " "+(M-45));
            }
        }
        if(H>0 && H<=23) {
            if(M>=45 && M<60) {
                System.out.println(H + " " + (M-45));
            }else if(M>=0 && M<45) {
                System.out.println((H-1) + " " + (M+15));
            }
        }
    }
}
