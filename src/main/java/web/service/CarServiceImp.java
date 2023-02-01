package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao;

    public CarServiceImp(){}

    @Autowired
    public CarServiceImp(CarDao carDao){
        this.carDao = carDao;
    }

    public List<Car> getList() {
        return carDao.getList();
    }

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> getListCar(Integer quantity) {
        return carDao.getListCar(quantity);
    }
}
