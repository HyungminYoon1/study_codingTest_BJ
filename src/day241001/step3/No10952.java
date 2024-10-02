package day241001.step3;

import java.io.*;

public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A, B;
        String inputLine = "";
        boolean isFirst = true;

        while(true){
            inputLine = br.readLine();
            A = Integer.parseInt(inputLine.split(" ")[0]);
            B = Integer.parseInt(inputLine.split(" ")[1]);
            if (A == 0 && B == 0) {
                break;  // A와 B가 0이면 반복 종료
            }
            if(!isFirst){
                bw.write("\n");
            }
            bw.write(String.valueOf(A + B));
            isFirst = false;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
