public class Customer {
    private String name;
    private int unitsConsumed;

    public Customer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public String getName() {
        return name;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }
}
