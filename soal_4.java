import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class soal_4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan ipk: ");
        double ipk = input.nextDouble();
        System.out.print("masukkan jumlah prestasi: ");
        int prestasi = input.nextInt();

        if (ipk >= 3.5 && prestasi >= 5){
            System.out.println("cumlaude");
        }else if(ipk > 3.5 && prestasi > 0 && prestasi <= 5){
            System.out.println("baik sekali");
        }else{
            System.out.println("baik");
        }
    }
}