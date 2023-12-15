package fruit_seller_project;

public class Fruit {
    String name;
    String variety;
    double totalQuantityKg;
    double pricePerKg;

    public Fruit(String name, String variety, double totalQuantityKg, double pricePerKg) {
        this.name = name;
        this.variety = variety;
        this.totalQuantityKg = totalQuantityKg;
        this.pricePerKg = pricePerKg;
    }
}