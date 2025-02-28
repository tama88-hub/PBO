/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelasRegulerMalam;

/**
 *
 * @author admin
 */
public class MainKinetic {
    private double massa, kecepatan;
    
    //rumus Energi Kinetik
    public double rumusEnergiKinetic(){
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    
}
