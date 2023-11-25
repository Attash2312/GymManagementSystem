public class CardioEquipment extends Equipment {
    private String type;

    public CardioEquipment(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

       public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
