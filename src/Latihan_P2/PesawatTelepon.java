package Latihan_P2;

public class PesawatTelepon {
    String jenis;
    int harga;
    
    void isi(String jenisPesawatTelepon, int hargaPesawatTelepon){
        jenis=jenisPesawatTelepon;
        harga=hargaPesawatTelepon;
    }
    
    void tampil(){
        System.out.println("Jenis Pesawat Telepon : "+jenis);
        System.out.println("Harga Pesawat Telepon : "+harga);
    }
}