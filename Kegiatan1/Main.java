package Kegiatan1;

public class Main{
    public static void main(String[] args) {
        System.out.println("======== Kerucut ========= ");
        Kerucut Kerucut = new Kerucut(2, 3, 5);
        System.out.println("luasPermukaan = "+Kerucut.getLuasPermukaan());
        System.out.println("volume = "+Kerucut.getVolume());
        System.out.println("\n\n======== Bola ========");
        Bola Bola = new Bola(2);
        System.out.println("luas permukaan = "+Bola.getLuasPermukaan());
        System.out.println("volume = "+Bola.getVolume());
    }
}
