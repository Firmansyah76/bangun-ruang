package Kegiatan3;

public class Limas extends Persegi {
    public int tinggi;
    public double getVolume(){
        return luas()*tinggi/3;
    }
    public Limas (int tinggi){
        super(sisi);
        this.tinggi=tinggi;
        System.out.println("tinggi = "+tinggi);
    }
}
