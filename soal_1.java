import java.util.Scanner;
public class soal_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Masukkan Angka ---");
        long original = sc.nextLong();
        long n = Math.abs(original);
        int sum = 0;


        while (n > 0){
            int digit = (int)(n%10);
            sum += digit;
            n /= 10;
        }
        boolean kelipatan3 = (sum % 3 == 0 );
        boolean genap = (original % 2 == 0 );  

        System.out.println("sum of digits = " + sum);
        System.out.println("kelipatan 3 =" + (kelipatan3 ? "YA" : "TIDAK"));
        System.out.println("genap  =" + (genap ? "YA" : "TIDAK"));

        sc.close();
    }
}