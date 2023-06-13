package geometri;
public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        double panjang = 4.5;
        double lebar = 3.0;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        double luas = persegiPanjang.hitungLuas();
        double keliling = persegiPanjang.hitungKeliling();

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
