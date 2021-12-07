package web.DAO;

import web.controller.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCar(int count);
}
