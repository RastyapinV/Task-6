package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Zeekr 001", "China"));
        cars.add(new Car(++CARS_COUNT, "Lada Granta", "Russia"));
        cars.add(new Car(++CARS_COUNT, "Geely Monjaro", "China"));
        cars.add(new Car(++CARS_COUNT, "Niva", "Russia"));
        cars.add(new Car(++CARS_COUNT, "Lada Vesta", "Russia"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
