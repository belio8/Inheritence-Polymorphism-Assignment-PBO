public class Bentuk {
    protected String warna;
    public Bentuk(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return this.warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void printInfo() {
        System.out.printf("Warna %-3s: %s%n", ' ', this.warna);
    }
}