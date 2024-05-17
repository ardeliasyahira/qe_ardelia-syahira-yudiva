import java.util.*;

public class ShippingCostCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Isi berat paket Anda (kg): ");
        double weight = scanner.nextDouble(); //Input akan diubah dalam bentuk desimal

        System.out.print("Isi jarak untuk ke destinasi Anda (km): ");
        double distance = scanner.nextDouble(); //Input akan diubah dalam bentuk desimal

        double weightCost;
        if (weight < 2) {
            weightCost = 10000;
        } else if (weight <= 7) {
            weightCost = 15000;
        } else if (weight <= 15) {
            weightCost = 25000;
        } else {
            weightCost = 40000;
        }

        double distanceCost;
        if (distance < 1) {
            distanceCost = 2000;
        } else if (distance <= 7) {
            distanceCost = 5000;
        } else if (distance <= 15) {
            distanceCost = 10000;
        } else {
            distanceCost = 20000;
        }

        // Calculate total cost
        double totalCost = weightCost + distanceCost;

        // Print the total cost
        System.out.println("The total shipping cost is: Rp " + totalCost);

        scanner.close();
    }
}