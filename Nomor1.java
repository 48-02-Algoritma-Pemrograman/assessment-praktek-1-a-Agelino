import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Baca jumlah jam lembur dari pengguna
        System.out.print("Masukkan jumlah jam lembur: ");
        int jamLembur = input.nextInt();
        
        double honorLembur;
        
        // Perhitungan honor lembur
        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000;
        } else {
            honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
        }
        
        // Tampilkan hasil
        System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honorLembur);

        /*
          mulai

             deklarasi varibel
             jamLembur=interger;
             honorLembur=double;

             input jamLembur

             if (jamlembur <=16) THEN
                output= jamlembur *10.000

            else THEN
        output = jamlembur *15000

end if

selesai
 */
    }
}
