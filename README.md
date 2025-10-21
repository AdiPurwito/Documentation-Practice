# Kalkulator Konversi Suhu 

**Ini adalah aplikasi konsol (command-line) sederhana yang ditulis dalam bahasa Java. Aplikasi ini berfungsi untuk mengkonversi suhu dari Celsius ke Fahrenheit.**

## ⚙️ Teknologi yang Digunakan
* **Bahasa:** Java (JDK)
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub

## ⌨️ ShortcutAuto
    psvm (atau `main`): Mengetik `psvm` lalu `Tab` untuk secara otomatis membuat method `public static void main(String[] args)`.
    sout: Mengetik `sout` lalu `Tab` untuk secara otomatis membuat `System.out.println()`.

## 🍀 Fitur

* Menerima input suhu dalam format Celsius dari pengguna.
* Menampilkan hasil konversi ke format Fahrenheit.

## ▶️ Cara Menjalankan

Anda dapat menjalankan program ini dari IDE:

1.  Pastikan kedua kelas (`Main` dan `KalkulatorSuhu`) berada dalam *package source* yang sama.
2.  Klik kanan pada file `Main.java` atau di dalam editornya.
3.  Pilih "Run 'Main.main()'".
4.  Input suhu akan diminta di panel "Run" di bagian bawah, dan hasilnya akan merubah suhu dari `celsius` ke `Farenheit`.

## Struktur Proyek

Proyek ini dibagi menjadi dua kelas utama untuk memisahkan tanggung jawab (Separation of Concerns):

* **`Main.java`**: Berisi *entry point* (method `main`) aplikasi. Kelas ini bertanggung jawab untuk berinteraksi dengan pengguna (menerima input dan menampilkan output).
* **`KalkulatorSuhu.java`**: Kelas ini menyimpan *business logic* (logika bisnis) dari aplikasi. Bertanggung jawab penuh untuk melakukan perhitungan konversi suhu.

## 🗒️ Catatan

Struktur kode ini adalah hasil dari beberapa teknik *refactoring* untuk meningkatkan kualitas kode:

1.  **Extract Class**: Logika, data, dan tanggung jawab untuk konversi suhu dipisahkan dari kelas `Main` ke kelasnya sendiri, yaitu `KalkulatorSuhu`.
2.  **Extract Method**: Logika untuk menjalankan aplikasi di dalam `main` dipindahkan ke method baru (`jalankanAplikasi()`) agar `main` tetap bersih dan ringkas.
3.  **Encapsulate Field**: Data suhu (`celsius`) di dalam `KalkulatorSuhu` dibuat `private` dan diakses melalui constructor untuk menyembunyikan implementasi internal.
4.  **Move Method**: Logika perhitungan (`konversiKeFahrenheit()`) dipindahkan dari `Main` ke kelas `KalkulatorSuhu`, tempat data yang relevan (yaitu `celsius`) berada.
5.  **Replace Magic Number**: Angka `1.8` dan `32` yang tidak memiliki konteks jelas, diganti dengan konstanta bernama `PENGALI` dan `TITIK_BEKU` agar kode lebih mudah dibaca dan dipelihara.
