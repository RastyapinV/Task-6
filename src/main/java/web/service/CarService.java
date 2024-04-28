package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private final CarDAO carDAO = new CarDAO();

    public List<Car> getCars(String s) {
        List<Car> carList = new ArrayList<>();
        List<Car> carListDB = carDAO.getCars();

        if (s == null || Integer.parseInt(s) > 5)
            carList.addAll(carListDB);
        else for (int i = 0; i < Integer.parseInt(s); i++)
            carList.add(carListDB.get(i));

        return carList;
    }
}
