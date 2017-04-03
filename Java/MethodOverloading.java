public class MethodOverloading{
public static void main (String[] args){
MethodOverloading method = new MethodOveloading();
method.methodTampilkan("Belajar Java Kuy");
method.methodTampilkan("Belajar Java Kuy", "Hingga Mengerti")
}

private void methodTampilkan(String nama){
System.out.println(nama);
}

private void methodTampilkan(String nama1, String nama2){
System.out.println(nama1*nama2);
}

}