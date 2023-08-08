import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        Customer customer = new Customer(name, unitsConsumed);
        double billAmount = ElectricityBillingSystem.calculateBill(unitsConsumed);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Units consumed: " + customer.getUnitsConsumed());
        System.out.println("Bill amount: $" + billAmount);

        scanner.close();
    }
}
