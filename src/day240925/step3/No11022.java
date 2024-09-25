package day240925.step3;

import java.io.*;

public class No11022 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String inputStr = br.readLine();
            int A = Integer.parseInt(inputStr.split(" ")[0]);
            int B = Integer.parseInt(inputStr.split(" ")[1]);
            bw.write("Case #"+(i+1)+": "+A+" + "+B+" = " + (A+B)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
