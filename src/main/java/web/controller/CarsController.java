package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import web.service.CarsService;


@Controller

public class CarsController {
    private final CarsService carsService;

    public CarsController() {
        carsService = new CarServiceImpl();
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars";
    }
}
