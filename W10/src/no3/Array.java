package no3;

public class Array {
	public static void main(String[] args) {
		int array[] = {12, 52, 10,};
		System.out.println("Nilai array");
		try {
			for(int a = 0;a < 5;a++) {
				System.out.println("index " + a + ": " + array[a]);
			}			
		}
		catch(Exception ex){
			System.out.println(" Nilai Index dari array  telah melebihi batas");
			System.out.println("Panjang array: " + array.length);
		}
	}
}