/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelasRegulerMalam;

/**
 *
 * @author admin
 */
public class Pajak {
    private String vendor, tipe;
    private double harga;
    
    public void setVendor(String vendor){
        this.vendor = vendor;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public String getVendor(){
        return vendor;
    }
    
    public String getTipe(){
        return tipe;
    }
    
    public double getHarga(){
        return harga;
    }
    
    //rumus menghitung harga setelah PPN
    
    public double hitungHarga(){
        double ppn = 0;
        
        if (harga > 4500000){
            ppn = 0.05;
        }else if (harga > 4200000 && harga <= 4500000){
            ppn = 0.02;
        }else if (harga > 4000000 && harga <= 4200000){
            ppn = 0.01;
        }else {
            ppn = 0.005;
        }
        
        return harga + (harga * ppn);
    }
}
