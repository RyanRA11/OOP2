public class CalculatorMain{
	int z;
public void perkalian(int x, int y){
	z = x + y;
System.out.println("Hasil:" +z);
}

public static void main(String args[]){
int a = 20, b = 10;
CalculatorMain cal = new CalculatorMain();
Calculator cal2 = new Calculator();
cal2.pertambahan(a, b);
cal2.pengurangan(a, b);
cal.perkalian(a, b);
}
}