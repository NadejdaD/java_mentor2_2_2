package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Hennessey Venom GT", 1471));
        cars.add(new Car(2, "SSC Tuatara", 1350));
        cars.add(new Car(3, "Koenigsegg Agera", 1200));
        cars.add(new Car(4, "Bugatti Veyron Super Sport", 1250));
        cars.add(new Car(5, "SSC Ultimate Aero TT", 1183));
        return cars;
    }
}

