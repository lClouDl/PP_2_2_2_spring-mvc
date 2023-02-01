package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getList();
    void add(Car car);
    List<Car> getListCar(Integer quantity);
}
