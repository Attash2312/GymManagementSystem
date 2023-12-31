public class WeightedEquipment extends Equipment {
    private double weightCapacity;
    private String resistanceType;

    public WeightedEquipment(String name, int quantity, double price, String description, double weightCapacity, String resistanceType) {
        super(name, quantity, price, description);
        this.weightCapacity = weightCapacity;
        this.resistanceType = resistanceType;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public String getResistanceType() {
        return resistanceType;
    }

    public void setResistanceType(String resistanceType) {
        this.resistanceType = resistanceType;
    }

    public void displayWeightedEquipmentInfo() {
        super.displayEquipmentInfo();  // Call the displayEquipmentInfo method from the parent class
        System.out.println("Weight Capacity: " + weightCapacity);
        System.out.println("Resistance Type: " + resistanceType);
    }

}