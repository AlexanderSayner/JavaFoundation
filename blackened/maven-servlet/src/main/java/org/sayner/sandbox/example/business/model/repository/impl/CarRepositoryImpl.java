package org.sayner.sandbox.example.business.model.repository.impl;

import org.sayner.sandbox.example.business.model.Car;
import org.sayner.sandbox.example.business.model.repository.CarRepository;

import java.util.*;

public class CarRepositoryImpl implements CarRepository {
    private static final CarRepositoryImpl INSTANCE = new CarRepositoryImpl();
    private final Map<Integer, Car> carsById;

    public static CarRepositoryImpl getInstance() {
        return INSTANCE;
    }

    public CarRepositoryImpl() {
        super();
        this.carsById = new LinkedHashMap<Integer, Car>();

        final Car car1 = new Car(1, "Lanser");
        carsById.put(car1.getId(), car1);
        final Car car2 = new Car(2, "Lanser Evolution");
        carsById.put(car2.getId(), car2);
        final Car car3 = new Car(3, "Galant");
        carsById.put(car3.getId(), car3);
    }

    @Override
    public List<Car> findAll() {
        return new LinkedList<>(this.carsById.values());
    }

    @Override
    public Car findById(final Integer id) {
        return this.carsById.get(id);
    }
}
