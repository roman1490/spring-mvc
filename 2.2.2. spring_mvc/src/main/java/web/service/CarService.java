package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> carList = new ArrayList<Car>(){{
        add(new Car("white", "Toyota", 180));
        add(new Car("blue", "Nissan", 190));
        add(new Car("red", "Mazda", 200));
        add(new Car("black", "Honda", 250));
        add(new Car("orange", "Mitsubishi", 160));
    }};

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getSomeCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
