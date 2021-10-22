package Aggregation;

class KTA {
	int nim;
	String Nama;
	String jurusan;
	Ket alamat;
	KTA (int nim, String Nama, String jurusan, Ket alamat){
		this.nim = nim;
		this.Nama = Nama;
		this.jurusan = jurusan;
		this.alamat = alamat;
	}
	public static void main(String args[]) {
	Ket add = new Ket ("R", "XXXV");
	KTA card = new KTA (201511063,"Thoriq Fadhillah", "D3 Teknik Informatika", add);
	
	System.out.println("----------------------------");
	System.out.println("|  KARTU TANDA MAHASISWA   |");
	System.out.println("----------------------------");
	System.out.println("NIM 		 : " + card.nim);
	System.out.println("Nama	 	 : " + card.Nama);
	System.out.println("Jurusan   	 : " + card.jurusan);
	System.out.println("Nama Bagus	 : "  + " " + add.Nbagus);
	System.out.println("Angkatan 	 : "  + " " + add.Angkatan);

}
}