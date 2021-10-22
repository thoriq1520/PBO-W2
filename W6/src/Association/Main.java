package Association;

import java.io.*;

public class Main {
	public static void main (String[] args)
	{
	Mahasiswa mhs = new Mahasiswa("Thoriq");
	dosen ds = new dosen("Mickel");
	
	System.out.println(mhs.getMahasiswaName()  + " adalah Mahasiswa " + "dari Dosen " + ds.getdosenName());

	}
}
