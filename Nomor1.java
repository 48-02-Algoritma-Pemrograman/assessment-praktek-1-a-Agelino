public class Nomor1 {
    public static void main(String[] args) {
        int jamLembur = 12;  // Contoh nilai jam lembur

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

         jamLembur =20;

         System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honorLembur);

    }
}
