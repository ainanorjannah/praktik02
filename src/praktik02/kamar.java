
 package praktik02;

/**
 *
 * @author PC
 */
public class kamar {
    double panjang;
    double lebar;

    public kamar() {
        panjang=90;
        lebar=80;
    }
    
    
    
    void cetakInfo(){
        System.out.println("Panjang             :"+panjang);
        System.out.println("Lebar            :"+lebar);
    }
    
    
    double hitungLuasKamar(){
        double luas;
        luas=panjang+lebar;
        return luas;
    }
    void cetakLuasKamar(){
        System.out.println("Luasnya adalah : "+hitungLuasKamar());
    
    }
}