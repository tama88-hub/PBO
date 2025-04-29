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
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pajak smartphone = new Pajak();
        
        System.out.println("Input Data Smartphone");
        System.out.print("Masukkan Vendor: ");
        smartphone.setVendor(input.nextLine());
        
        System.out.print("Masukkan Tipe: ");
        smartphone.setTipe(input.nextLine());
        
        System.out.print("Masukkan Harga : ");
        smartphone.setHarga(input.nextDouble());
        
        
        System.out.println("Data Smartphone");
        System.out.println("Vendor : "+smartphone.getVendor());
        System.out.println("TIpe : "+smartphone.getTipe());
        System.out.println("Harga Asli : "+smartphone.getHarga());
        
        double hitungHarga = smartphone.hitungHarga();
        System.out.println("Harga Setelah PPN : Rp."+hitungHarga);
    }
}
