public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Blue", 22000, 25);

        Ford ford1 = new Ford(140, 25000, "Red", 5000, 2018, 2000);
        Ford ford2 = new Ford(150, 30000, "Black", 35000, 2019, 2500);

        Car car = new Car(100, 15000, "Green", 18000);

        System.out.println("Sale price of Sedan: " + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: " + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: " + ford2.getSalePrice());
        System.out.println("Sale price of Car: " + car.getSalePrice());
    }
}
