package day241001.step3;

import java.io.*;

public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;

        // 입력이 끝날 때까지 반복 (EOF)
        while ((inputLine = br.readLine()) != null) {
            String[] numbers = inputLine.split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);
            System.out.println(A + B);
        }

        br.close();
    }
}
