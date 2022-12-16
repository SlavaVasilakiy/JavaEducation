

import java.util.Scanner;

class InputData {
    Scanner sc = new Scanner(System.in);

    public String words() {
        return sc.nextLine();
    }

}

class OutputData {
    String word1 = new InputData().words();
    String word2 = new InputData().words();
    String solution = new Solution().mergeAlternately(word1, word2);

}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}

public class StringMerge {
    public static void main(String[] args) {
        String result = new OutputData().solution;
        System.out.println(result);
        System.gc();
    }
}
