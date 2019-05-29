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
public class FibbonacciProblemRecursive {
    
public static int fib(int x) {
        
        int fib[] = new int[x + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < x + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];

        }
        return fib[x];
    }

    public static void main(String[] args) {
        System.out.println(fib(10));

    }
}
