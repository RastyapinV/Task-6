package web.model;

public class Car {
    private int id;
    private String model;
    private String developmentCountry;

    public Car() {
    }

    public Car(int id, String model, String developmentCountry) {
        this.id = id;
        this.model = model;
        this.developmentCountry = developmentCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDevelopmentCountry() {
        return developmentCountry;
    }

    public void setSeries(String developmentCountry) {
        this.developmentCountry = developmentCountry;
    }
}
