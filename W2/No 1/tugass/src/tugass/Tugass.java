/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugass;

/**
 *
 * @author Thor
 */
import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class Tugass {
    public static void main(String []argh){
        int n, a, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECK DATA TYPES\n");
        System.out.println("Input the amount of data you want to check: ");
        n = sc.nextInt();
        
        for (i=0 ; i< n ; i++){
            try{
                System.out.println("Input the data: ");
                a = sc.nextInt();
                System.out.println("-> " + a + " can be fitted in:");
                    if(a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) System.out.println("* byte");
                    if(a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) System.out.println("* short");
                    if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) System.out.println("* int");
                    if(a >= Long.MIN_VALUE && a <= Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
