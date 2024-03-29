package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCarTable(@RequestParam(value = "q", required = false) Integer quantity, Model model){
        model.addAttribute("listCar", carService.getListCar(quantity));
        return "cars";
    }
}
