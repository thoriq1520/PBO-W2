/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

/**
 *
 * @author Thor
 */
import java.util.*;
public class InputOutput {

	public static void main(String[] args) {
		String k; // inisiasi untuk keyboard
		Scanner keyboard = new Scanner(System.in);
		k = keyboard.nextLine();
		k.trim();
		if(k.length()==0) //jika input kosong maka akan print "input kosong" dan langsung exit
                {
			System.out.println("Input kosong!");
		}else //jika input ada/tidak kosong maka lanjut
                {
			
			String[] kata = k.split("[, !._?'@]");
			System.out.println(kata.length);
			int i;
			for(i=0;i<=kata.length-1 ;i++) {
				System.out.println(kata[i]);
				}
			}
		
		
	}
}
