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
public class Fraction {
    private long numerator;
    private long denominator;
    
    public Fraction() {
        this(1,1);
    }
    
    public Fraction(long num, long den) {
        numerator = num;
        denominator = den;
    }
    
    public long getNumerator() {
        return numerator;
    }
    
    public long getDenominator() {
        return denominator;
    }
    
    public void setNumerator(long to) {
        numerator = to;
    }
    
    public void setDenominator(long to) {
        denominator = to;
    }
    
    public double getValue() {
        return (double)numerator / (double)denominator;
    }
    
    @Override
    public String toString() {
        return String.valueOf(getNumerator()) + "\n" + "------------------ = " + String.valueOf(getValue()) +  "\n" + String.valueOf(getDenominator()) + "\n";
    }
}
