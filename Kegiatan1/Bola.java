package Kegiatan1;

import Kegiatan1.BangunRuang;

public class Bola extends BangunRuang {
    private double r;

    public double getLuasPermukaan(){
        return 4*3.14*r*r;
    }
    public double getVolume(){
        return 3.14*r*r*r*4/3;
    }
    public Bola (double r){
        this.r=r;
        System.out.println("jari jari = "+this.r);
    }
}