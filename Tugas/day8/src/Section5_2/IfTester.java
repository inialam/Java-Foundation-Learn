/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5_2;

/**
 *
 * @author richied
 */
public class IfTester {
    public static void main(String[] args) {
        
//        //ada 2 kondisi yang harus dicek
        int kehadiran=80,nilai=75;
//        
        if(kehadiran>=80)
        {
            if(nilai>=80 && nilai <=100)
                System.out.println("Anda eligible untuk mendapatkan beasiswa");
            else if(nilai<80 && nilai>=0)
                System.out.println("Anda belum eligible mendapatkan beasiswa");
            else
                System.out.println("Nilai yang anda masukan tidak valid");
        }
        else
        {
            System.out.println("Jumlah kehadiran anda tidak memenuhi syarat");
        }
    
    }
}
