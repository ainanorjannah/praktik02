
 package praktik02;

/**
 *
 * @author PC
 */
public class kamar {
    double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("Panjang             :"+panjang);
        System.out.println("Lebar            :"+lebar);
    }
    
    
    double hitungLuasKamar(){
        double luas;
        luas=panjang+lebar;
        return luas;
    }
    
}
