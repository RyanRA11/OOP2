class Universitas{
	public void ruangkelas(){
		System.out.println("Universitas memiliki kelas");
	}
}
class TIF extends Universitas{
	public void kelass(){
		System.out.println("TIF memiliki kelas");
		super.kelass();
	}
}

public class Kelas{
	private String Board;
	private String Infocus;
	private String AC;

	//getter
	public String getAC(){
		return AC;
	}
	
	//setter
	public void setAC(String AC){
		this.AC=AC;
	}
}