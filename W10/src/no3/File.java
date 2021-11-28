package no3;


import java.io.FileInputStream;

public class File {
	public static void exceptionFile() {
		try {
			FileInputStream textFile = new FileInputStream("text.txt");
			textFile.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		exceptionFile();
	}
}