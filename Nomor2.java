import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int omzetBeliau = 0, omzetMereka = 0, omzetKita = 0, totalTrip = 0;
        String lagi = "Y"; 
        
        
        while (lagi.equals("Y")) {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String driver = input.next();
            
            
            System.out.print("Lama trip (km): ");
            int lamaTrip = input.nextInt();
            totalTrip += lamaTrip;
            
    
            if (driver.equals("Beliau")) {
                omzetBeliau += lamaTrip * 13000;
            } else if (driver.equals("Mereka")) {
                omzetMereka += lamaTrip * 13000;
            } else if (driver.equals("Kita")) {
                omzetKita += lamaTrip * 13000;
            } else {
                System.out.println("Nama driver tidak valid!");
            }
            
            
            System.out.print("Input lagi (Y/N)?: ");
            lagi = input.next();
        }
        
      
        String driverTertinggi;
        int omzetTertinggi;
        
        if (omzetBeliau >= omzetMereka && omzetBeliau >= omzetKita) {
            driverTertinggi = "Beliau";
            omzetTertinggi = omzetBeliau;
        } else if (omzetMereka >= omzetBeliau && omzetMereka >= omzetKita) {
            driverTertinggi = "Mereka";
            omzetTertinggi = omzetMereka;
        } else {
            driverTertinggi = "Kita";
            omzetTertinggi = omzetKita;
        }
        
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);
    }
}
