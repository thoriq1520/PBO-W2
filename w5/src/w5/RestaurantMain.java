/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5;

/**
 *
 * @author Thor
 */
import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		byte a,b;
		Restaurant menu = new Restaurant();
		Scanner input = new Scanner(System.in);
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 30);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
		System.out.println();
		System.out.println("Masukan nomor menu : ");
		a = input.nextByte();
		System.out.println("Masukan banyak pesanan : ");
		b = input.nextByte();
		menu.pesanMenuMakanan(a, b);
		
		menu.tampilMenuMakanan();
	}
	

}
