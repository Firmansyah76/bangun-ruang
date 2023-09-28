package Kegiatan3;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== PERSEGI ========");
        Persegi Persegi = new Persegi(4);
        System.out.println("luas Persegi = "+Persegi.luas());
        System.out.println("keliling Persegi = "+Persegi.keliling());
        System.out.println("\n========= Lingkaran ========");
        Lingkaran Lingkaran = new Lingkaran(5);
        System.out.println("luas Lingkaran = "+Lingkaran.luas());
        System.out.println("keliling Lingkaran = "+Lingkaran.keliling());
        System.out.println("\n======== Limas =========");
        Limas Limas = new Limas(5);
        System.out.println("volume Limas = "+Limas.getVolume());
        System.out.println("\n========= Tabung ========");
        Tabung Tabung = new Tabung(7);
        System.out.println("volume Tabung = "+Tabung.getVolume());

    }
}
