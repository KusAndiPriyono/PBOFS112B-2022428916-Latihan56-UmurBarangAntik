package pbofs112b.pkg2022428916.latihan56.umurbarangantik;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
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
