/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajiagent;

/**
 *
 * @author Thor
 */
import java.util.*;
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);		
		final int gaji = 500000;
		final int Item = 50000;
		int penjualan, bonus, denda, gajiakhir = 0;
		
		penjualan = keyboard.nextInt();
		if (penjualan >= 80) {
			bonus = (penjualan * Item) * (35/100);
			gajiakhir = gaji + bonus ;
			System.out.println(gajiakhir);
		} 
		else if (penjualan >= 40 && penjualan < 80) {
			bonus = (penjualan * Item) * (25/100);
			gajiakhir = gaji + bonus;
			System.out.println(gajiakhir);
		}
		else if (penjualan <= 15 && penjualan < 40) {
			denda = ((15 * Item) - (14 * Item)) * 15/100;
			gajiakhir = gaji - denda;
			System.out.println(gajiakhir);		}
		else {
			bonus = penjualan * (Item * 10/100);
			gajiakhir = gaji + bonus;
			System.out.println(gajiakhir);		}
}
    
}
