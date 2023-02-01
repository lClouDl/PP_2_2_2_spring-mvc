package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;


@Controller
public class CarController {

    private ApplicationContext context;

    public CarController(){}

    @Autowired
    public CarController(ApplicationContext context){
        this.context = context;
    }

    @GetMapping("/cars")
    public String getCarTable(@RequestParam(value = "q", required = false) Integer quantity, Model model){
        CarService carService = context.getBean(CarServiceImp.class);
        model.addAttribute("listCar", carService.getListCar(quantity));
        return "cars";
    }
}
