package org.sayner.sandbox.example.business.model.repository;

import org.sayner.sandbox.example.business.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> findAll();

    Car findById(final Integer id);
}
