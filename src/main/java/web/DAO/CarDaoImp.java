package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private static List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car("Subaru", 2022, "white"));
        listCar.add(new Car("Toyota", 2010, "black"));
        listCar.add(new Car("Lada", 2023, "silver"));
        listCar.add(new Car("BMW", 2021, "red"));
        listCar.add(new Car("Lifan", 2012, "gray"));
    }

    public List<Car> getList() {
        return listCar;
    }
    @Override
    public void add(Car car) {
        listCar.add(car);
    }

    @Override
    public List<Car> getListCar(Integer quantity) {
        return (quantity != null && quantity < this.listCar.size()) ? this.listCar.subList(0, quantity) : this.listCar;
    }
}
