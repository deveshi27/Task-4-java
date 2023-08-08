public class ElectricityBillingSystem {
    private static final double RATE_PER_UNIT = 0.10;

    public static double calculateBill(int unitsConsumed) {
        return unitsConsumed * RATE_PER_UNIT;
    }
}
