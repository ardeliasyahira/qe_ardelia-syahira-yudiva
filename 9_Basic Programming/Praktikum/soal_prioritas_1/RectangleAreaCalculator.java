import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang (length) dan lebar (width)
        System.out.print("Masukkan panjang persegi panjang (p): ");
        int panjang = scanner.nextInt();

        System.out.print("Masukkan lebar persegi panjang (l): ");
        int lebar = scanner.nextInt();

        // Hitung luas persegi panjang
        int luas = panjang * lebar;

        // Tampilkan luas
        System.out.println("Luas persegi panjang: " + luas);

        // Tentukan apakah luasnya genap atau ganjil
        if (luas % 2 == 0) {
            System.out.println("even rectangle");
        } else {
            System.out.println("odd rectangle");
        }

        // Tutup scanner
        scanner.close();
    }
}
