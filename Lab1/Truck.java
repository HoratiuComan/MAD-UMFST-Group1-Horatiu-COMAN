public class Truck extends Car {
    public int weight;

    public Truck(int speed, double regularPrice, String color, double SalePrice, int weight) {
        super(speed, regularPrice, color, SalePrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getRegularPrice() * 0.9;
        } else {
            return super.getRegularPrice() * 0.8;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
