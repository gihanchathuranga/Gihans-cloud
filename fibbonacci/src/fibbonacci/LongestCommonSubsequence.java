/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonacci;

import java.util.Scanner;

/**
 *
 * @author iit15063
 */
public class LongestCommonSubsequence {

    int computeLCS(char[] seq1, char[] seq2) {

        int N = seq1.length;
        int M = seq2.length;

        int[][] lcs_table = new int[N + 1][M + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if (i == 0 || j == 0) {
                    lcs_table[i][j] = 0;
                } else if (seq1[i - 1] == seq2[j - 1]) {
                    lcs_table[i][j] = 1 + lcs_table[i - 1][j - 1];
                } else {
                    lcs_table[i][j] = Math.max(lcs_table[i - 1][j], lcs_table[i][j - 1]);
                }
            }
        }

        return lcs_table[N][M];
    }

    public static void main(String[] args) {
        LongestCommonSubsequence sc = new LongestCommonSubsequence();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Word : ");
        String s1 = input.next();
        System.out.print("Enter Your Seconed Word : ");
        String s2 = input.next();

        char[] w1 = s1.toCharArray();
        char[] w2 = s2.toCharArray();
        int a1 = w1.length;
        int a2 = w2.length;

        int ls = sc.computeLCS(w1, w2);

        System.out.println("" + ls);

    }

}
