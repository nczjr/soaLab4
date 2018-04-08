package zad3;

public class Car {

    private final String brand;
    private final String model;
    private final String engine;
    private final Double price;


    public Car(String brand, String model, String engine, Double price) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "main.java.zad3.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
