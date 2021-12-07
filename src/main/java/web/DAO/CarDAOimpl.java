package web.DAO;

import web.controller.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDAOimpl implements CarDAO{
    @Override
    public List<Car> getCar(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("a", 1, 11));
        list.add(new Car("b", 2, 22));
        list.add(new Car("a", 3, 33));
        list.add(new Car("a", 4, 44));
        list.add(new Car("a", 5, 55));

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
