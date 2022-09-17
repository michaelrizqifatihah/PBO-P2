package Latihan_P2;

public class Manusia {
    String nama;
    int umur;
    
    void isivariabel(String namaManusia, int umurManusia){
        nama=namaManusia;
        umur=umurManusia;
    }
    void printManusia(){
        System.out.println("Nama Manusia : "+nama);
        System.out.println("Umur Manusia : "+umur);
    }
}