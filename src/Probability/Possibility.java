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
public abstract class Possibility {
    protected final Fraction fraction;
    
    public Possibility() {
        this(1,1);
    }
    
    public Possibility(long n, long r) {
        fraction = new Fraction(n, r);
    }
    
    @Override
    public String toString() {
        return fraction.toString();
    }
    
    public abstract Fraction calc();
}
