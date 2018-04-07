
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Named
@SessionScoped
public class CarHandler implements Serializable {

        private final List<Car> cars;

        private String brand;
        private String model;
        private String engine;
        private String price;
        private String clientName;
        private String telephoneNumber;

        private List<String> models;
        private List<String> engineTypes;
        private Map<String, List<String>> carsMap;

        public CarHandler() {

            cars = List.of(new Car("Ford", "Escort", "ON", 555000.0),
                    new Car("Ford", "Mondeo", "petrol", 33300.0),
                    new Car("Ford", "Mondeo", "ON", 54000.0),
                    new Car("Renault", "Kangoo", "ON", 54000.0),
                    new Car("Renault", "Clio", "ON", 48000.0),
                    new Car("Renault", "Megane", "ON", 81000.0),
                    new Car("Renault", "Kangoo", "petrol", 60000.0));

            engineTypes = List.of("ON", "petrol");
            carsMap = new HashMap<>();
            carsMap.put("Ford",List.of("Escort", "Mondeo"));
            carsMap.put("Renault",List.of("Kangoo", "Clio", "Megane"));
            brand = "Ford";
            models = carsMap.get(brand);
            model = models.get(0);
            engine = engineTypes.get(0);
        }


        public void updateModels(ValueChangeEvent e) {
            brand = e.getNewValue().toString();
            models = carsMap.get(brand);
            model = models.get(0);
        }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getModels() {
        return models;
    }

    public void setModels(List<String> models) {
        this.models = models;
    }

    public Map<String, List<String>> getCarsMap() {
        return carsMap;
    }

    public List<String> getEngineTypes() {
        return engineTypes;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public List<Car> getFilteredCars() {
        return cars.stream().filter(car -> car.getBrand().equalsIgnoreCase(brand) &&
                                            car.getModel().equalsIgnoreCase(model) &&
                                            car.getEngine().equalsIgnoreCase(engine)).collect(Collectors.toList());
    }

}
