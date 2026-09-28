public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(String warna, double sisi) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("Sisi %-4s: %.2f%n", ' ', this.sisi);
        System.out.printf("Luas %-4s: %.2f%n", ' ', this.hitungLuas());
    }
}