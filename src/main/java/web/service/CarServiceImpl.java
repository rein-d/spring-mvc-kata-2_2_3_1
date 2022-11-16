package web.service;

import web.dao.CarsDao;
import web.dao.CarsDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarsService{
    CarsDao carsDao = new CarsDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carsDao.getAllCars();
        }
        return carsDao.getCarsByCount(count);
    }
}
