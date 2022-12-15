package Tests;

// Given two binary strings a and b, return their sum as a binary string.
//
//
//
//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"

public class Test25 {

    public static void main(String[] args) {
        System.out.println(Solution.addBinary("1101", "111"));
    }
    class Solution {
        static String addBinary(String a, String b) {
            if (a.length() < b.length()) {
                return addBinary(b, a);
            }
            int carry = 0;
            int j = b.length() - 1;
            String result = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                if (a.charAt(i) == '1') {
                    carry += 1;
                }
                if (j >= 0 && b.charAt(j) == '1') {
                    carry += 1;
                }
                result = (carry % 2) + result;
                carry /= 2;
                j--;
            }
            if (carry == 1) {
                result = 1 + result;
            }
            return result;
        }
    }
}
