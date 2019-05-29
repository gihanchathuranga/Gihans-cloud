/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonacci;

/**
 *
 * @author iit15063
 */
public class Dynamicprogramming {

    static int[] fact = new int[6];

    int factorialnumRecursion(int n) {

        if (n == 1) {
            return 1;

        }

        if (n == 0) {
            return 1;
        }
        return n * factorialnumRecursion(n - 1);
    }

    public static int factorialnumdp(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        if (fact[n] != 0) {
            return fact[n];
        }

        return fact[n] = n * factorialnumdp(n - 1);

    }

    public static void main(String[] args) {
        Dynamicprogramming dp = new Dynamicprogramming();
        int a = dp.factorialnumRecursion(5);
        System.out.println("Recursion " + a);

        int b = dp.factorialnumRecursion(5);
        System.out.println("Dynamic " + b);
    }
}
