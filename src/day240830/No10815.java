package day240830;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class No10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] inputString = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] inputString2 = br.readLine().split(" ");

        Set<Integer> holdingNums = new HashSet<>();
        for (int i = 0; i < N; i++) {
            holdingNums.add(Integer.parseInt(inputString[i]));
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(inputString2[i]);
            if (holdingNums.contains(num)) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        result.setLength(result.length() - 1);

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
