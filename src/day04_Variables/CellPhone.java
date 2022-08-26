package day04_Variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone X";
        String color = "Matte Black";
        double price = 999.99;
        boolean hasCamera = true;
        int memorySize = 256;
        char sim = 'A';

        System.out.println("\t\"Phone Info\"\nBrand: " + brand + "\nModel: " + model + "\nColor: " + color);
        System.out.println("Camera: " +hasCamera + "\nMemory size: " + memorySize + "gb\n" + "$" + price);
        System.out.println();
        // alternative solution

        String report = "\t\"Phone Info\"\nBrand: " + brand + "\nModel: " + model + "\nColor: " + color + "\nCamera: " +hasCamera + "\nMemory size: " + memorySize + "gb\n" + "$" + price;

        System.out.println(report);

    }
}
