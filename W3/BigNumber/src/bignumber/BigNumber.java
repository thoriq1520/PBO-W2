/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bignumber;

/**
 *
 * @author Thor
 */
import java.util.*;
import java.math.BigInteger;
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger W,X,Y,Z;
        
        Scanner keyboard = new Scanner (System.in);
        
        W = keyboard.nextBigInteger();
        X = keyboard.nextBigInteger();
        
        Y = W.add(X);
        Z = W.multiply(X);
        
        	System.out.println(Y);
		System.out.println(Z);
    }
    
}
