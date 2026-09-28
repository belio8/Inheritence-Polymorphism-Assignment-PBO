public class Exercise {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar("Merah", 5);
        Lingkaran lingkaran = new Lingkaran("Biru", 7);
        Silinder silinder = new Silinder("Hijau", 3, 10);

        System.out.println("Informasi Bujur Sangkar:");
        bujurSangkar.printInfo();
        System.out.println("\nInformasi Lingkaran:");
        lingkaran.printInfo();
        System.out.println("\nInformasi Silinder:");
        silinder.printInfo();
    }
}
