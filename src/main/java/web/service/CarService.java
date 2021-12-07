package web.service;

import web.controller.Car;

import java.util.List;

public interface CarService {
    List<Car> get(int count);
}
