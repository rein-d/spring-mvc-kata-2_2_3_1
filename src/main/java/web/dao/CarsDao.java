package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDao {
    List<Car> getAllCars();

    List<Car> getCarsByCount(int count);
}
