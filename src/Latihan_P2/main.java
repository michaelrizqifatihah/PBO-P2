package Latihan_P2;

public class main {
    public static void main(String[] args){
        
        //membuat objek dari class manusia
        Manusia manusia = new Manusia();
        
        //mengisi atribut class
        manusia.isivariabel("Michael Rizqi Fatihah", 23);
        
        //memanggil method print manusia
        manusia.printManusia();
        
        
        PesawatTelepon call= new PesawatTelepon();
        
       call.isi("Table Phone", 150000);
       call.tampil();
    }
}