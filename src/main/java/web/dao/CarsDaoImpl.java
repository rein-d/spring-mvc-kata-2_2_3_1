package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsDaoImpl implements CarsDao {
    private final List<Car> cars;

    public CarsDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Ferrari", "Red", 111));
        cars.add(new Car("Lamborghini", "Black", 222));
        cars.add(new Car("BMW", "Blue", 333));
        cars.add(new Car("Mercedes", "Silver", 444));
        cars.add(new Car("Жигули", "Red", 555));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> carsByCount = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carsByCount.add(cars.get(i));
        }
        return carsByCount;
    }
}
