import java.util.Scanner;
public class soal_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a =  input.nextInt();
        System.out.print("Masukka angka kedua: ");
        int b =  input.nextInt();
        System.out.print("Masukkan angka ketiga:");
        int c = input.nextInt();

        if (a+b>c && a+c>b && b+c>a){
        if (a == b && b == c) {
            System.out.println("Segitiga sama sisi");
        }else if(a == b || b == c || a == c){
            System.out.println("Segitiga sama kaki");
        }else{
            System.out.println("Segitiga sembarang");
        }
    }else {
        System.out.println("bukan segitiga");
    }input.close();
    }
}