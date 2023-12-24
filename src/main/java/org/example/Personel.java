package org.example;

public class Personel {

    String isim;
    String soyisim;
    String departman;
    int yas;

    public void kim (){
        System.out.println(isim + " " + soyisim + departman + " departmaninda");
    }


    public int getYas() {

        return yas;
    }

}