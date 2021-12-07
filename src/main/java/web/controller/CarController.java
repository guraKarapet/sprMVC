package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import web.service.CarService;
import web.service.CarServiceImpl;
import web.controller.Car;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(required = false) Integer count, ModelMap model) {
        CarService car = new CarServiceImpl();
        List<web.controller.Car> list;
        if (count == null) {
            list = car.get(5);
        } else {
            list = car.get(count);
        }
        model.addAttribute("list", list);
        return "cars";
    }
}
