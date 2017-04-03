import java.util.Scanner;
public class IPMahasiswa {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int m,jml,nLulus=0, nTdLulus=0;
double rata,nilai=0,jumlah=0,lulus;
System.out.print("Jumlah Mahasiswa: ");
   
m = input.nextInt();
double []nilaiIP = new double[m];

for(int i=0;i<= m-1;i++){       
System.out.print("IP Mahasiswa " + (i+1) + ": ");
nilaiIP[i] = input.nextDouble();
System.out.println();
}
   
for(int j=0;j<= m-1;j++){
jumlah = jumlah + nilaiIP[j];
}

rata = jumlah/m;
nilai = nilaiIP[0];
lulus = 2.75;

for(int k=0;k<= m-1;k++){
if(nilaiIP[k] >= lulus){
nLulus = nLulus+1;
}else{
nTdLulus = nTdLulus+1;
}
}
        
System.out.println("Nilai rata-rata Mahasiswa: " + rata);
System.out.println("Lulus = " + nLulus);
System.out.println("Tidak Lulus = " + nTdLulus);
}
}