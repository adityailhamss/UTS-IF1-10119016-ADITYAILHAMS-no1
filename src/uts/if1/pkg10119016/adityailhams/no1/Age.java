package uts.if1.pkg10119016.adityailhams.no1;

/**
 *
 * @author aditi
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red = "\033[0;31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {
        return this.yearBirth;
    }
        
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return this.yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String tandanyaKamu;
        
        if (umur >= 0 && umur <= 5) {
            tandanyaKamu = "lagi lucu-lucu nya";
        } else if (umur > 5 && umur <= 10) {
            tandanyaKamu = "masih anak-anak";
        } else if (umur > 10 && umur <= 13) {
            tandanyaKamu = "masih remadja";
        } else if (umur > 13 && umur <= 19) {
            tandanyaKamu = "alay";
        } else if (umur > 19 && umur <= 29) {
            tandanyaKamu = "lagi galau nyari jodoh";
        } else if (umur > 29 && umur <= 35) {
            tandanyaKamu = "lagi sibuk nyari uang";
        } else if (umur > 35 && umur <= 150) {
            tandanyaKamu = "sudah tua";
        } else {
            tandanyaKamu = "tidak terdeteksi di kehidupan";
        }
        String kapital = tandanyaKamu.toUpperCase();
        return red.concat(kapital);
    }
}