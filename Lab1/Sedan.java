public class Sedan extends Car {

    public int length;

    public Sedan(int speed, double regularPrice, String color, double salePrice, int length) {
        super(speed, regularPrice, color, salePrice);
        this.length = length;
    }

    @Override
    public double getSalePrice() {

        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.90;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
