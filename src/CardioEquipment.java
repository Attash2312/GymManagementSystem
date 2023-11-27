public class CardioEquipment extends Equipment {
    private String type;
    private int maxSpeed;
    private int resistanceLevels;

    public CardioEquipment(String name, int quantity, String type, int maxSpeed, int resistanceLevels) {
        super(name, quantity);
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.resistanceLevels = resistanceLevels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getResistanceLevels() {
        return resistanceLevels;
    }

    public void setResistanceLevels(int resistanceLevels) {
        this.resistanceLevels = resistanceLevels;
    }

    public void displayCardioEquipmentInfo() {
        super.displayEquipmentInfo();  // Call the displayEquipmentInfo method from the parent class
        System.out.println("Type: " + type);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Resistance Levels: " + resistanceLevels);
    }

}