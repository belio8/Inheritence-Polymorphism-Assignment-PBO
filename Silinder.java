public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(String warna, double radius, double tinggi) {
        super(warna, radius);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.tinggi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Tinggi %-2s: %.2f%n", ' ', this.tinggi);
        System.out.printf("Volume %-2s: %.2f%n", ' ', this.hitungVolume());
    }
    
}
