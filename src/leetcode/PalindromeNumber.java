package leetcode;

import java.util.Scanner;

// 9. Palindrome Number
public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        long result = 0;
        int temp = x;

        // 음수는 palindrome number가 될 수 없음
        if (x < 0) {
            return false;
        }

        while (temp != 0) {
            result *= 10;
            result += temp % 10;
            temp /= 10;
        }

        if (x == (int)result) {
            return true;
        }

        return false;
    }
}
