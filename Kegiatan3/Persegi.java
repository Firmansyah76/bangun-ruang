package Kegiatan3;

public class Persegi implements BangunDatar {
    public static int sisi;
    //methodnya sama di kelas yg berhubungan
    public double luas(){
        return sisi*sisi;
    }

    public double keliling(){
        return 4*sisi;
    }
    public Persegi(int sisi){
        Persegi.sisi=sisi;
        System.out.println("sisi = "+sisi);
    }
}
