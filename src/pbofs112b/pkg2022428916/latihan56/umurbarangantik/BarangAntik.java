package pbofs112b.pkg2022428916.latihan56.umurbarangantik;

/**
 *
 * @author
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class BarangAntik {
    int umur;
    
    public BarangAntik (int umur) {
        this.umur = umur;
    }
    public void tampilUmur() {
        Radio r = new Radio(234);
        System.out.println("Umur barang antik ini adalah    : " + umur + " tahun ");
    }
}
