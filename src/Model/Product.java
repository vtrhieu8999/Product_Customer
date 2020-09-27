package Model;

public class Product implements OveralInterface<Product> {
    final private long id;
    final private String name;
    final private String manufacturer;
    private long price;

    public Product(long id, String name, String manufacturer, long price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public long getPrice() {
        return price;
    }
}
