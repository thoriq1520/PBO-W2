package no2;

import java.util.Scanner;

public class Hexadecimal{
	public static int Hexades(String hexa) {
		try {
			return Integer.parseInt(hexa, 16);
		} catch(NumberFormatException e) {
			System.out.println("Bukan inputan Hexa");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//print ke layar
		System.out.println("Menghitung Nilai Hexadesimal ke Desimal");
		System.out.println("-----------------------------------");
		System.out.println("\n");
		System.out.printf("Masukan angka Hexadesimal : ");
		String hexa = scan.next();
		 int des = Hexades(hexa);
		System.out.println("\nHasil bilangan pada decimal adalah: " + des);
		
		scan.close();
	}
}