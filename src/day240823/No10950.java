package day240823;

import java.io.*;

public class No10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String inputStr = br.readLine();
            int A = Integer.parseInt(inputStr.split(" ")[0]);
            int B = Integer.parseInt(inputStr.split(" ")[1]);
            bw.write((A+B) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
