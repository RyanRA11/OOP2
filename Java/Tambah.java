public class Tambah {
public static void main (String[] args){
Method method = new Method();
method.methodTampilkan2 ("Belajar Java Kuy");
System.out.println(method.tambahkanNilai (3, 5));
}

private void methodTampilkan2 (String nama){
System.out.println(nama);
}

private int tambahkanNilai (int x, int y){
return x + y;
}

}