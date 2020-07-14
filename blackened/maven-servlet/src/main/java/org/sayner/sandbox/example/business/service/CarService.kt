package org.sayner.sandbox.example.business.service

import org.sayner.sandbox.example.business.model.Car
import org.sayner.sandbox.example.business.model.repository.impl.CarRepositoryImpl

class CarService {
    private val carRepository: CarRepositoryImpl = CarRepositoryImpl.getInstance() ?: CarRepositoryImpl()
    fun findAll(): Iterable<Car> = carRepository.findAll()
    fun findById(id: Int): Car = carRepository.findById(id)
}
