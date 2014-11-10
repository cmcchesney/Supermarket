public class Product {

    private String name;
    private int price;
    private int quantity;
    private Rule rule;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, int price, int quantity, Rule rule) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.rule = rule;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getProductTotal() {
        if (rule != null) {
            return rule.calculatePrice(price, quantity);
        }
        return quantity * price;
    }

}
