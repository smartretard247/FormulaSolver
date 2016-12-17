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
public class Probability extends Possibility {
    public Probability() {
        super();
    }
    
    public Probability(long n, long r) {
        super(n, r);
    }
    
    @Override
    public Fraction calc() {
        fraction.setNumerator(fraction.getNumerator());
        fraction.setDenominator(fraction.getDenominator());
        
        return fraction;
    }
}
