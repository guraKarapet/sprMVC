package web.service;

import web.DAO.CarDAO;
import web.DAO.CarDAOimpl;
import web.controller.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDAO car = new CarDAOimpl();
    @Override
    public List<Car> get(int count) {
        return car.getCar(count);
    }
}
