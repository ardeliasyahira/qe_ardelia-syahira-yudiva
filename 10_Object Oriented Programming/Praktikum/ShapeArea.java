public class ShapeArea {

    //Menghitung luas persegi
    public static int getSquareArea(int sisi) {
        return sisi * sisi;
    }

    //Menghitung luas persegi panjang
    public static int getRectangleArea(int panjang, int lebar) {
        return panjang * lebar;
    }

    //Menghitung luas lingkaran
    public static double getCircleArea(int radius) {
        final double PI = 3.14;
        return PI * radius * radius;
    }

    //Menghitung luas Trapesium
    public static double getTrapesiumArea(int base1, int base2, int tinggi) {
        return 0.5 * (base1 + base2) * tinggi;
    }

    public static void main(String[] args) {
        //Untuk input dan output
        int squareArea = getSquareArea(12);
        System.out.println("luas persegi: " + squareArea);

        int rectangleArea = getRectangleArea(7,8);
        System.out.println("luas persegi panjang: " + rectangleArea);

        double circleArea = getCircleArea(21);
        System.out.println("luas lingkaran: " + circleArea);

        double trapesiumArea = getTrapesiumArea(5,6,2);
        System.out.println("Luas trapesium: " + trapesiumArea);
    }

}
