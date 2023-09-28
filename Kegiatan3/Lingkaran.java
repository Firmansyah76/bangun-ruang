package Kegiatan3;

public class Lingkaran implements BangunDatar{
        public static int jarijari;

        public double luas(){
            return 3.14*jarijari*jarijari;
        }

        public double keliling(){
            return 3.14*2*jarijari;
        }
    public Lingkaran(int jarijari){
            Lingkaran.jarijari=jarijari;
            System.out.println("jari jari = "+jarijari);
        }
}
