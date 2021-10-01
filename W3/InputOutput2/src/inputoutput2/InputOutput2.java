/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput2;


import java.util.*;
public class InputOutput2 {

	public static void main(String[] args) {
		String[] nama;
		short[] angka;
		nama = new String[3];
		angka = new short[3];
		Scanner scancnh = new Scanner(System.in);
		
		
		nama[0] = scancnh.next();
		angka[0] = scancnh.nextShort();
		nama[1] = scancnh.next();
		angka[1] = scancnh.nextShort();
		nama[2] = scancnh.next();
		angka[2] = scancnh.nextShort();
		
		System.out.println("--------------------------------");
		int i;
		for(i=0;i<=2; i++)//saat sudah menginput lebih dari 3 akan berhenti
                {
			
			System.out.printf("%-15s%03d\n", nama[i], angka[i]);
		}
		System.out.println("--------------------------------");
		
	}

}
    
    

