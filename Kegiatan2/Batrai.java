package Kegiatan2;

public class Batrai {
    public void charge(){
        System.out.println("mengisi daya");
        System.out.println("batrai akan penuh setelah "+(100-statusBatrai)*2+" menit");
    }
    public int statusBatrai;

}
