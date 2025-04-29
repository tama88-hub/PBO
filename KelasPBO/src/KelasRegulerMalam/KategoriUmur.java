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
public class KategoriUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i<= 3; i++){
            System.out.println("\nMasukkan data orang ke-"+i);
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Umur: ");
            int umur = Integer.parseInt(input.nextLine());
            
            String kategori;
            
            if (umur <5 ){
                kategori = "Balita";
            }else if(umur < 12){
                kategori = "Anak";
            }else if (umur < 18){
                kategori = "Remaja";
            }else if (umur < 40){
                kategori = "Dewasa";
            }else if (umur < 60){
                kategori = "Paruh Baya";
            }else{
                kategori = "Lanjut Usia";
            }
            
            System.out.println(nama +" Termasuk Kategori: "+kategori);
        }
        //input.close();
    }
}
