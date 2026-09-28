public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(String warna, double radius) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * this.radius * this.radius;
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("Radius %-2s: %.2f%n", ' ', this.radius);
        System.out.printf("Luas %-4s: %.2f%n", ' ', this.hitungLuas());
    }
}