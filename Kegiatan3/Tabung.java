package Kegiatan3;

public class Tabung extends Lingkaran{
    public int tinggi;
    public double getVolume(){
        return luas()*tinggi;
    }
    public Tabung(int tinggi){
        super(jarijari);
        this.tinggi=tinggi;
        System.out.println("tinggi = "+tinggi);
    }
}
