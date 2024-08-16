package day240816;

import java.io.*;

public class No25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            bw.write(isPalindrome(s)+" "+countRecursionCall(s)+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static int countSymmetricChars(String s){
        int count = 1;
        int left = 0;
        int right = s.length()-1;

        while(left <= right){
            if(s.charAt(left)!=s.charAt(right)){
                return count;
            }
            if(right == left) return count;
            count++;
            left++;
            right--;
        }
        return count;
    }

    public static int countRecursionCall(String s){
        return countSymmetricChars(s);
    }
}
