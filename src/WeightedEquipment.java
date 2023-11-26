public class WeightedEquipment extends Equipment {
    private double weightCapacity;
    private String resistanceType;

    public WeightedEquipment(String name, int quantity, double weightCapacity, String resistanceType) {
        super(name, quantity);
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

}