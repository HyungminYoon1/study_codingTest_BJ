package day240924.step3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No25314 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = (int) Math.ceil((double)N/4);

        for (int i = 0; i < count; i++) {
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
    }
}
