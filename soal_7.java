import java.util.Scanner;
public class soal_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan durasi parkir (dalam jam): ");
        int durasi_parkir = input.nextInt();
        

        if (durasi_parkir <= 0){
            System.out.println("Durasi parkir tidak valid");
        }else if (durasi_parkir == 1){
            System.out.println("biaya parkir : Rp 3000");
        }else if (durasi_parkir >=  2 && durasi_parkir <= 4){
            int total = 3000 +(durasi_parkir -1 ) * 2000;
            System.out.println("biaya parkir : Rp" + total);
        }else if(durasi_parkir > 4) {
            int total = 3000 + (3*2000)+(durasi_parkir -4) * 1000;
            System.out.println("biaya parkir : Rp" + total);
        }
        input.close();
    }
}