package day240823;

import java.util.*;

public class No15649_gpt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int N = Integer.parseInt(inputStr.split(" ")[0]);
        int M = Integer.parseInt(inputStr.split(" ")[1]);

        List<List<Integer>> combinations = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Generate all combinations of M elements from N elements
        generateCombinations(combinations, new ArrayList<>(), 1, N, M);

        // Step 2: Generate all permutations of each combination
        for (List<Integer> combination : combinations) {
            generatePermutations(result, new ArrayList<>(), combination, new boolean[M]);
        }

        // Step 3: Sort the permutations lexicographically
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < M; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Print the result
        for (List<Integer> permutation : result) {
            String eachLine = permutation.toString();
            eachLine = eachLine.replaceAll(",", "");
            eachLine = eachLine.substring(1, eachLine.length() - 1);
            System.out.println(eachLine);
        }
    }
    // Method to generate all combinations of M elements from S
    private static void generateCombinations(List<List<Integer>> combinations, List<Integer> temp, int start, int N, int M) {
        if (temp.size() == M) {
            combinations.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= N; i++) {
            temp.add(i);
            generateCombinations(combinations, temp, i + 1, N, M);
            temp.remove(temp.size() - 1);
        }
    }

    // Method to generate all permutations of a given combination
    private static void generatePermutations(List<List<Integer>> result, List<Integer> temp, List<Integer> combination, boolean[] used) {
        if (temp.size() == combination.size()) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < combination.size(); i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(combination.get(i));
            generatePermutations(result, temp, combination, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
