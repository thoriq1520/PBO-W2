package no3;



public class Pembagian {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		}
		catch(Exception ex) {
			System.out.println("Hasil pembagian tidak valid");
		}
	}
}