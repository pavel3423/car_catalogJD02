package by.htp.car_catalog.dao;

import java.util.List;

import by.htp.car_catalog.domain.Car;

public interface CarDao extends BaseDao<Car> {

    List<Car> readByBrandAndModel(String brand, String model);
}
