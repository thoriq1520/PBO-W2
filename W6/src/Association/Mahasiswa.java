package Association;

	class Mahasiswa{
			private String name;
			private String NIM;
			//nama mahasiswa
				Mahasiswa(String name){
					this.name = name;
				
				
}
				public void setNIM(String NIM) {
					this.NIM = NIM;
				}
				
	public String getMahasiswaName(){
	return this.name;
	}
	
	public String getNIM() {
		return this.NIM;
	}
}