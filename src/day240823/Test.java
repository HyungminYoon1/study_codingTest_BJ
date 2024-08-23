package day240823;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] allNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] currentNums = {4, 3, 10, 9};
        int[] nextNumArray = getNextNumArray(allNums, currentNums, 4);
        System.out.println(Arrays.toString(nextNumArray)); // Expected output: [4, 5, 1, 2]
    }

    public static int[] getNextNumArray(int[] allNums, int[] currentNums, int M) {
        int[] nextNums = currentNums.clone();
        boolean[] used = new boolean[allNums.length];

        // 현재 선택된 숫자들을 사용된 것으로 표시
        for (int num : currentNums) {
            used[num - 1] = true;
        }

        // Step 1: Find the first number from the right that can be increased
        int i = M - 1;
        while (i >= 0) {
            used[nextNums[i] - 1] = false; // 현재 숫자를 사용 취소
            int nextVal = findNextAvailable(used, nextNums[i], allNums.length);
            if (nextVal != -1) {
                nextNums[i] = nextVal;
                used[nextVal - 1] = true;
                break;
            }
            i--;
        }

        // Step 2: Fill the remaining slots with the smallest possible values
        int index = i + 1;
        for (int j = 0; j < allNums.length && index < M; j++) {
            if (!used[j]) {
                nextNums[index++] = allNums[j];
                used[j] = true;
            }
        }

        return nextNums;
    }

    // 주어진 값보다 큰 값 중 사용되지 않은 값을 찾는다
    private static int findNextAvailable(boolean[] used, int currentVal, int maxVal) {
        for (int i = currentVal; i < maxVal; i++) {
            if (!used[i]) {
                return i + 1; // allNums의 값이 1부터 시작하므로 인덱스 + 1
            }
        }
        return -1; // 찾지 못함
    }
}