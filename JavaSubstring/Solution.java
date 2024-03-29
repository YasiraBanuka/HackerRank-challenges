import java.util.*;

// Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1. You'll find the String class' substring method helpful in completing this challenge.

// Input Format

// The first line contains a single string denoting s.
// The second line contains two space-separated integers denoting the respective values of start and end.

// Constraints

// 1  <= |s| <= 100
// 0 <= start < end <= n
// String s consists of English alphabetic letters (i.e., [a - zA - Z]) only.

// Output Format
// Print the substring in the inclusive range from start to end-1.

// Sample Input
// Helloworld
// 3 7

// Sample Output
// lowo

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        // Use substring to get the substring from start to end-1
        String subString = S.substring(start, end);

        // Print the result
        System.out.println(subString);
    }
}