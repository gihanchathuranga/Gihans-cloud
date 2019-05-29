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
public class Topup {

    public static int fib(int x) {

        int fib[] = new int[x + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < x + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];

        }
        return fib[x];
    }

    public static int fibtopdown(int n, int[] fib) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (fib[n] != 0) {
            return fib[n];

        } else {
            fib[n] = fibtopdown(n - 1, fib) + fibtopdown(n - 2, fib);

            return fib[n];
        }

    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        int n = 12;
        int[] fib = new int[n + 1];
        System.out.println(fibtopdown(n, fib));
    }

}
