package Association;

import java.io.*;

public class Main {
	public static void main (String[] args)
	{
	Mahasiswa mhs = new Mahasiswa("Thoriq");
	dosen ds = new dosen("Mickel");
	mhs.setNIM("201511063");
	
	System.out.println(mhs.getMahasiswaName());
	System.out.println(mhs.getNIM()+ "\nMerupakan Mahasiswa dari" );
	System.out.println(ds.getdosenName());

	}
}
