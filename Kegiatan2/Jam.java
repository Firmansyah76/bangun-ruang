package Kegiatan2;

public class Jam {
    Batrai Batrai;//objek dri kls btre
    public Jam(int persen,Batrai batrai){
        this.Batrai = batrai;
        this.Batrai.statusBatrai = persen;
    }
    public void notification(){
        if (Batrai.statusBatrai <= 20 ){
            System.out.println("batrai anda lowbat......");
        }
        else {
            System.out.println("Jam siap digunakan");
        }
    }
}
