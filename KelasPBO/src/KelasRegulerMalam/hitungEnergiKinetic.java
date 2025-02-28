/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelasRegulerMalam;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class hitungEnergiKinetic {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetic kinetic = new MainKinetic();
        
        while(true){
            try {
                //input massa
                System.out.print("Input Massa(Kg): ");
                double massa = scanner.nextDouble();
                kinetic.setMassa(massa);
        
                //input kecepatan
                System.out.print("Input Kecematan(M/s): ");
                double kecepatan = scanner.nextDouble();
                kinetic.setKecepatan(kecepatan);
        
                //hitung inputan menggunakan rumus
                double energiKinetic = kinetic.rumusEnergiKinetic();
        
                System.out.println("Energi Kinetik " + energiKinetic + " Joule");
            
            
                System.out.print("Apakah Anda Ingin Menghitung Lagi?(y/n)");
            
                String looping = scanner.next();
                if (!looping.equalsIgnoreCase("y")){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Inputan Harus Berupa Angka Kakak, Silahkan Ulangi lagi ya");
                scanner.nextLine();
            }
            
        }
        
        
        System.out.println("Terimakasih :-D");
        scanner.close();
    }
}
