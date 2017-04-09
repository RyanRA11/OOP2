public class InheritenceOveriding_RuangKelas extends Universitas{
	String board;
	String infocus;
	String ac;
	String kursi;

public void set( String board,String infocus, String ac, String kursi){
	this.board = board;
	this.infocus = infocus;
	this.ac = ac;
	this.kursi = kursi;
	}
public void kelas(){
	super.kelas();
	System.out.println("Fasilitas kelas TIF Weekend" + " \n");
	System.out.println("White board  :" + board);
	System.out.println("Infocus      :" + infocus);
	System.out.println("AC           :" + ac);
	System.out.println("Kursi        :" + kursi);
	}

public static void main(String[] args) {
	InheritenceOveriding_RuangKelas rk = new InheritenceOveriding_RuangKelas();
	rk.set("menerangkan materi manual", "menampilkan materi dari laptop", "penyejuk ruangan", "tempat duduk mhs/dosen");
	rk.kelas();
	}
}