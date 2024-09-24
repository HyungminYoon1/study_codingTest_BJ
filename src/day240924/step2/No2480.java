package day240924.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        br.close();
        Integer[] numbers = new Integer[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(inputStr.split(" ")[i]);
        }
        // 배열을 Set으로 변환
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(numbers));

        if(numberSet.size() == 1){
            for(int s : numberSet){
                System.out.println(10000+s*1000);
            }
        }else if (numberSet.size() == 2){
            for(int s : numberSet){
                if( getCount(numbers, s)==2) {
                    System.out.println(1000+s*100);
                }
            }
        }else if (numberSet.size() == 3){
            System.out.println(getMaxNumber(numbers)*100);
        }
    }

    public static int getCount(Integer[] numbers, int target) {
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static int getMaxNumber(Integer[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
