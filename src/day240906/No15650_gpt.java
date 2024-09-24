package day240906;

import java.util.*;

public class No15650_gpt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int N = Integer.parseInt(inputStr.split(" ")[0]);
        int M = Integer.parseInt(inputStr.split(" ")[1]);

        StringBuilder result = new StringBuilder();
        int[] sequence = new int[M];
        combination2(sequence, 0, 1, N, M, result);

        System.out.println(result);
    }

    public static void combination2(int[] sequence, int depth, int start, int N, int M, StringBuilder result) {
        if (depth == M) {
            // 수열을 한 번에 StringBuilder에 추가
            for (int i = 0; i < M; i++) {
                result.append(sequence[i]).append(' ');
            }
            result.append('\n');
            return;
        }
        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            combination2(sequence, depth + 1, i + 1, N, M, result);
        }
    }
}
