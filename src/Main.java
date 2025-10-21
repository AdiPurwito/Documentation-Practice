import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        jalankanAplikasi();
    }

    public static void jalankanAplikasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");

        double Celsius = scanner.nextDouble();

        KalkulatorSuhu kalkulator = new KalkulatorSuhu(Celsius);
        double suhuFahrenheit = kalkulator.konversiKeFahrenheit();

        System.out.println("Hasil konversi ke Fahrenheit: " + suhuFahrenheit);
    }
}