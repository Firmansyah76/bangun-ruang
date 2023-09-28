package Kegiatan2;

public class Main {
    public static void main(String[] args) {
        Batrai Batrai = new Batrai();//objek btre
        Jam Jam = new Jam(80,Batrai);
        System.out.println("==========  Logitech G733 =========");
        System.out.println("batrai = "+ Jam.Batrai.statusBatrai+"%");
        Jam.notification();
        if (Jam.Batrai.statusBatrai <= 15){
            Jam.Batrai.charge();
        }
    }
}
