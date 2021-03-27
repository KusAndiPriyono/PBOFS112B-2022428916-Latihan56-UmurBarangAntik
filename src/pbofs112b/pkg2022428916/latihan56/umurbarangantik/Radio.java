package pbofs112b.pkg2022428916.latihan56.umurbarangantik;

/**
 *
 * @author Kus Andi Priyono
 */
public class Radio extends BarangAntik {
    private String name;
    
    public Radio (int umur) {
        super(umur);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
