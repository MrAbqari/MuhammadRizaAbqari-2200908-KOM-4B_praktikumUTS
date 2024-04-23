package Soal4;

public class Main { 
    public static void main(String[] args) {
        Balok Balok1 = new Balok();
        Balok1.setPanjang(1);
        Balok1.setLebar(1);
        Balok1.setTinggi(1);
        System.out.println("Balok dengan panjang: " + Balok1.panjang + ", lebar: " + Balok1.lebar + " dan tinggi: " + Balok1.tinggi + ". Luasnya: " 
                + Balok1.getLuas() + ", sedangkan kelilingnya: " + Balok1.getKeliling() + " dan volumenya: " + Balok1.getVolume());
        System.out.println();
        
        Balok Balok2 = new Balok();
        Balok2.setPanjang(30);
        Balok2.setLebar(40);
        Balok2.setTinggi(50);
        System.out.println("Balok dengan panjang: " + Balok2.panjang + ", lebar: " + Balok2.lebar + " dan tinggi: " + Balok2.tinggi + ". Luasnya: " 
                + Balok2.getLuas() + ", sedangkan kelilingnya: " + Balok2.getKeliling() + " dan volumenya: " + Balok2.getVolume());
        System.out.println();
        
        Balok Balok3 = new Balok();
        Balok3.setPanjang(25);
        Balok3.setLebar(35);
        Balok3.setTinggi(45);
        System.out.println("Balok dengan panjang: " + Balok3.panjang + ", lebar: " + Balok3.lebar + " dan tinggi: " + Balok3.tinggi + ". Luasnya: " 
                + Balok3.getLuas() + ", sedangkan kelilingnya: " + Balok3.getKeliling() + " dan volumenya: " + Balok3.getVolume());
        System.out.println();
    }    
}
