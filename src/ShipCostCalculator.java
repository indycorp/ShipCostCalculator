import java.util.Scanner;

class ShipCostCalculator {
    void main() {
        Scanner in = new Scanner(System.in);

        double shipCost = 0;
        double itemPrice = 0;
        double totalCost = 0;
        String trash = "";
        // Get the item price from the user
        IO.print("enter your item price ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble(); // read the value
            in.nextLine();    // Clear the new line from the key buffer
        } else {
            trash = in.nextLine();
            IO.println("you must enter a valid number not " + trash);
            IO.println("return the program and try again! ");
            System.exit(0);
        }

        if (itemPrice >= 100) {
            shipCost = 0;
            totalCost = itemPrice;
        } else {
            shipCost = itemPrice * .02;
            totalCost = itemPrice + shipCost;
        }

        IO.println("Shipping cost: " + shipCost);
        IO.println("Total cost: " + totalCost);
    }
}