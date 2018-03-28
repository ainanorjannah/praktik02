package praktik02;

public class KamarAksi {
    public static void main(String[] args) {
        
        kamar r1 = new kamar();
        r1.lebar = 15;
        r1.panjang = 30;
        
        r1.cetakInfo();
        System.out.println("Luas Kamar = "+r1.hitungLuasKamar());
        r1.cetakLuasKamar();
        
        kamar r2 = new kamar();
        r2.cetakInfo();
        
        kamar r3 = new kamar();
        r3.cetakInfo();
        
    }
    
}
