public class Ford extends Car {
    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, double SalePrice, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color, SalePrice);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
