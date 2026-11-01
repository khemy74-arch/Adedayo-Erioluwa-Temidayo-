import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item       : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Unit price : %.2f%n", unitPrice);
        System.out.printf("Total cost : %.2f%n", totalCost);

        input.close();
    }
}
