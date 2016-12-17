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
public class Combination extends Possibility {
    public Combination() {
        super();
    }
    
    public Combination(long n, long r) {
        super(n, r);
    }
    
    @Override
    public Fraction calc() {
        long n = fraction.getNumerator();
        long r = fraction.getDenominator();
        fraction.setNumerator(Functions.factorial(n));
        fraction.setDenominator(Functions.factorial(n-r)*Functions.factorial(r));
        
        return fraction;
    }
}
