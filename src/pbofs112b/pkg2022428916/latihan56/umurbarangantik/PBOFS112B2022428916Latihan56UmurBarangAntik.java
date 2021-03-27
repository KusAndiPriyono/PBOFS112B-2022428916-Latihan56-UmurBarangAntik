/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2022428916.latihan56.umurbarangantik;

/**
 *
 * @author Kus Andi Priyono
 */
public class PBOFS112B2022428916Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama Barang Antik   : " + r.getName());
        r.tampilUmur();
    }
    
}
