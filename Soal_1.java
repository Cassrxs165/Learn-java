import java.util.Scanner;
public class Soal_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN ANGKA : ");

        long original = sc.nextLong();
        long n = Math.abs(original);
        int sum = 0;
        boolean
        

        while (n> 0) {
            sum += n % 10;
            n /= 10;
        }

        boolean kelipatan3 = ( sum % 3 == 0);
        boolean genap = (original % 2 == 0);

        System.out.println("sum of digits: " + sum );
        System.out.println("kelipatan 3: " + (kelipatan3 ? "YA" : "BUKAN" ));
        System.out.println("genap: " + (genap ? "YA" : "BUKAN"));

        sc.close();
    }
}