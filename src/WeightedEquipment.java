public class WeightedEquipment extends Equipment {
    private double weightCapacity;

    public WeightedEquipment(String name, int quantity, double weightCapacity) {
        super(name, quantity);
        this.weightCapacity = weightCapacity;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
