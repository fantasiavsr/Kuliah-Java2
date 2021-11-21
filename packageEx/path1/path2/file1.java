package packageEx.path1.path2;

class file1 {
    public static void main(String[] args) {
		String a;
		String b;
		String c;
		
		a="Alif";
		b="1A";
		c="Teknologi Informasi";
		
		Mahasiswa m1=new Mahasiswa();
		
		m1.setNama(a);
		m1.setKelas(b);
		m1.setJurusan(c);
		
		m1.TampilData();
    }
}
