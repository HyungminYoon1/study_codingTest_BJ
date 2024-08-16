package day240816;

import java.util.Scanner;

public class No10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(recursiveGeneralFibonacci(n));
    }

    public static int recursiveGeneralFibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return recursiveGeneralFibonacci(n-2)+ recursiveGeneralFibonacci(n-1);
    }
}
