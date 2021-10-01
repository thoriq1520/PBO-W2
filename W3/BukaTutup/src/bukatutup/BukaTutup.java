/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukatutup;

/**
 *
 * @author Thor
 */
import java.util.*;
public class BukaTutup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
		
		String semua;
                int no1, no2, no3, no4;	
		
		no1 = keyboard.nextInt();
		no2 = keyboard.nextInt();
		no3 = keyboard.nextInt();
		no4 = keyboard.nextInt();
		
		
		semua = String.valueOf(no1) + String.valueOf(no2) + String.valueOf(no3) + String.valueOf(no4);
	
		long Allplat = Long.parseLong(semua);
		Allplat = Allplat - 999999;
		byte modulo = (byte)(Allplat % 5);
		
		
		if (modulo == 0) {
			System.out.println("Berhenti");
		}
		else if (modulo != 0) {
			System.out.println("Jalan");
		}
    }
    
}
