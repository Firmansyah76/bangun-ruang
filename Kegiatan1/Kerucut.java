package Kegiatan1;

import Kegiatan1.BangunRuang;

public class Kerucut extends BangunRuang {
    private double r,s,t;

    public double getLuasPermukaan(){
        return 3.14*r*(r+s);
    }

    public double getVolume(){
        return 3.14*r*r*t/3;
    }
    public Kerucut (double r,double s,double t){
        this.r=r;
        this.s=s;
        this.t=t;
        System.out.println("jari jari = "+this.r);
        System.out.println("garis pelukis = "+this.s);
        System.out.println("tinggi = "+this.t);
    }

}