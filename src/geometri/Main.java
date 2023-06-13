/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        Lingkaran lingkaran = new Lingkaran(radius);

        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
        System.out.println("");
        
        double panjang = 4.5;
        double lebar = 3.0;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        double luas1 = persegiPanjang.hitungLuas();
        double keliling1 = persegiPanjang.hitungKeliling();
        
        
        System.out.println("");
        System.out.println("Luas persegi panjang: " + luas1);
        System.out.println("Keliling persegi panjang: " + keliling1);
    }
}
