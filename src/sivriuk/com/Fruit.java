package sivriuk.com;

public class Fruit {
    private double pricePerKg;
    private int weight;
    private FruitType type;
    private Color color;

    public Fruit(double pricePerKg, int weight, FruitType type, Color color) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.type = type;
        this.color = color;
    }
    public void getPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void getWeight(int weight) {
        this.weight = weight;
    }

    public void getType(FruitType type) {
        this.type = type;
    }

    public void getColor(Color color) {
        this.color = color;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public double getPrice() {
        return pricePerKg * weight / 1000.0;
    }

    public String toString() {
        return String.format("(pricePerKg = %s , weight = %s " +
                "type = %s, color = %s)", pricePerKg, weight, type, color);

    }

}
