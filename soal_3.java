import java.util.Scanner;
public class soal_3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        if (usia <= 12 ){
            System.out.println("Anak");
        }else if (usia >= 13 && usia <= 16){
            System.out.println("Remaja");
        }else{
            System.out.println("Dewasa");
    }


        
    }
}