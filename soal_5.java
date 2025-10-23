import java.util.Scanner;
public class soal_5 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("masukkan total belanja: ");
        int total_belanja = input.nextInt();
        
        double diskonRate;
        
        

        if (total_belanja < 100000 ) {
            diskonRate = 0.0;
        }else if (total_belanja < 300000){
            diskonRate = 0.05;
        }else if (total_belanja < 500000){
            diskonRate = 0.10;
        }else{ 
            diskonRate = 0.15;
        }

        System.out.println("anda mendapatkan diskon sebesar: " + (int)(diskonRate*100) + "%");
        input.close();

    }
}