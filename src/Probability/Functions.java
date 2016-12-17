/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Probability;

/**
 *
 * @author Jeezy
 */
public final class Functions {
    public static long factorial(long n) {
        long answer;
        if(n <= 1) return 1;
        answer = factorial(n-1) * n;
        return answer;
    }
}
