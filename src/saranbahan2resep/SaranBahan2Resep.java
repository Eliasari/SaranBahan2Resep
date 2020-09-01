package saranbahan2resep;

import java.util.Scanner;

/**
 *
 * @author Elia Sari
 */
public class SaranBahan2Resep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String identitas = "Elia Sari / XR3 / 12";
        System.out.println("Identitas : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bahan Pertama : ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2){
            System.out.println("Bahan Kedua : ");
            if (bahan1 == 1){
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukkan no pilihan Anda : ");
            int bahan2 = scanner.nextInt();
            
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan, "+ "tidak dapat memberikan saran resep");
    }
    
}
