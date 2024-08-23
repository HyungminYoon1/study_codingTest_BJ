package day240823;

import java.util.Scanner;

public class No15649 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int N = Integer.parseInt(inputStr.split(" ")[0]);
        int M = Integer.parseInt(inputStr.split(" ")[1]);
        printResult(N, M);
    }

    // 전체 배열의 갯수 반환
    public static int getTotalCount(int N, int M) {
        int count = 1;
        for (int i = N; i > N-M; i--) {
            count = count * i;
        }
        return count;
    }

    // 첫 번째 배열 반환
    public static String getFirstIntString(int M) {
        String firstArray = "1";
        for (int i = 2; i < M+1; i++) {
            firstArray = firstArray + " " + i;
        }
        return firstArray;
    }
    // 마지막 배열 반환
    public static String getLastIntString(int N, int M) {
        StringBuilder lastArray = new StringBuilder();
        for (int i = N; i > N - M; i--) {
            lastArray.append(" ").append(i);
        }
        return lastArray.toString();
    }

    // 주어진 숫자로 만든 배열 반환
    public static String getStringWithPickedNumArray(int [] pickedNums) {
        StringBuilder result = new StringBuilder(String.valueOf(pickedNums[0]));
        for (int i = 1; i < pickedNums.length; i++) {
            result.append(" ").append(pickedNums[i]);
        }
        return result.toString();
    }
    // 순열로 표현된 문자열을 int 배열로 반환
    public static int [] getPickedNumArrayWithString(String arrayString, int M) {
        int [] pickedNums = new int[M];
        for (int i = 0; i < M; i++) {
            pickedNums[i] = Integer.parseInt(arrayString.split(" ")[i]);
        }
        return pickedNums;
    }
    // (** 핵심 코드 **) 정수 배열이 주어졌을 때 그 다음 배열을 찾는 매서드
    public static int[] getNextNumArray(int[] allNums, int[] currentNums, int M) {
        int[] nextNums = currentNums.clone();
        boolean[] used = new boolean[allNums.length];

        // 현재 선택된 숫자들을 사용된 것으로 표시
        for (int num : currentNums) {
            used[num - 1] = true;
        }

        // Step 1: 마지막자리부터 체크하여 증가할 수 있는 첫 번째 수가 있으면 그 수를 넣고, 없으면 -1을 넣은 후 그 이전 자리를 점검
        int position = M - 1;
        while (position >= 0) {
            used[nextNums[position] - 1] = false; // 현재 자리의 숫자 배정 취소
            int nextVal = findNextAvailable(used, nextNums[position], allNums.length); // 원래의 값보다 큰 수 중 사용되지 않은 최소값 입력. 없으면 -1 입력
            if (nextVal != -1) { // 만약 -1이 아닌 숫자가 배정되었다면 루프 탈출.
                nextNums[position] = nextVal;
                used[nextVal - 1] = true;
                break;
            }
            position--; // -1이 배정되었다면 그 이전자리를 점검
        }

        // Step 2: 앞자리부터 시작하여 -1이 배정된 자리를 사용되지 않는 숫자로 채움. 사용되지 않는 숫자 중 최소 숫자부터 채움
        int index = position + 1;
        for (int j = 0; j < allNums.length && index < M; j++) {
            if (!used[j]) {
                nextNums[index++] = allNums[j];
                used[j] = true;
            }
        }
        return nextNums;
    }

    // 주어진 값보다 큰 값 중 사용되지 않은 최소값 찾기
    private static int findNextAvailable(boolean[] used, int currentVal, int maxVal) {
        for (int i = currentVal; i < maxVal; i++) {
            if (!used[i]) {
                return i + 1; // allNums의 값이 1부터 시작하므로 인덱스 + 1
            }
        }
        return -1; // 찾지 못하면 -1 반환
    }

    public static String getNextString(String currentString, int N, int M) {
        if(currentString.equals(getLastIntString(N, M))) {
            return "";
        }
        int[] allNums = new int[N];
        for (int i = 0; i < N; i++) {
            allNums[i]=i+1;
        }
        int [] currentNums = getPickedNumArrayWithString(currentString, M);
        int [] nextNums = getNextNumArray(allNums, currentNums, M);
        return getStringWithPickedNumArray(nextNums);
    }

    public static void printResult(int N, int M) {
        int count = getTotalCount(N, M);
        String[] line = new String[count];
        line[0] = getFirstIntString(M);
        for (int i = 1; i < count; i++) {
            line[i] = getNextString(line[i - 1], N, M);
        }
        for (String s : line) {
            System.out.println(s);
        }
    }
}
