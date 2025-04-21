package lexsmallestlcs;
import java.util.Scanner;
public class LexSmallestLCS {
    // Function to find the length of the longest common subsequence of
    // sequences s1[0…m-1] and `s2[0…n-1]
    public static String lexSmallestLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

 // dp matrix to store result of sub calls for lcs
        int[][] dp = new int[m + 1][n + 1];

     // Building the matrix in bottom up way
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // if the last character of s1 and s2 matches
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                     // otherwise, if the last character of s1 and s2 don't match
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Following code is used to print LCS
        int lcsLength = dp[m][n];

       // Create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder sb = new StringBuilder();

       // one by one store characters in lcs[]
        int i = m;
        int j = n;


        while (lcsLength > 0) {
            // If current character in s1[] and s2 are same, then
      // current character is part of LCS
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                sb.append(s1.charAt(i - 1));// Put current character in result
                i--;                        // reduce values of i, j and index
                j--;
                lcsLength--;
            } else {
                // If not same, then find the larger of two and
                // go in the direction of larger value
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        // reverse the string
        // print string
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        // Printing the sub sequence length
        System.out.println(lexSmallestLCS(s2, s1).length());
        System.out.println(" ");
        // Printing the sub sequence
        System.out.println(lexSmallestLCS(s2, s1));
    }
}
