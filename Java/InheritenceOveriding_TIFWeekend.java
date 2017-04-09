class Universitas{
	
	public void kelas(){
		System.out.println("Universitas memiliki kelas");
	}
}
class TIF extends Universitas{
	public void kelas(){
		System.out.println("TIF memiliki kelas");
		super.kelas();
	}
}

public class InheritenceOveriding_TIFWeekend{
	public static void main(String[]args){
		Universitas univ = new Universitas();
		TIF tif = new TIF();
		univ.kelas();
		tif.kelas();
	}
}