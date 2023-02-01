package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getList();
    void add(Car car);
    List<Car> getListCar(Integer quantity);
}
