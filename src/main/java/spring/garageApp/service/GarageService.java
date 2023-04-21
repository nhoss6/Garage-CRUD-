
package spring.garageApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import spring.garageApp.model.Car;
import spring.garageApp.repository.GarageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

// Un service permet de fournir les données métiers aux controlleurs
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;

    ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1, "Model S", "Tesla", 2019, Car.Color.RED),
            new Car(2, "Model 3", "Tesla", 2019, Car.Color.BLUE),
            new Car(3, "Model X", "Tesla", 2019, Car.Color.GREEN),
            new Car(4, "Model Y", "Tesla", 2019, Car.Color.YELLOW),
            new Car(5, "Model Z", "Tesla", 2019, Car.Color.BLACK)

    ));

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    // méthode GetCar filtrer le tableau par rapport à l'id et retourner le premier
    public Car getCar(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void addCar(Car car) {
        garageRepository.save(car);
    }

    public void deleteCar(long id) {
        garageRepository.deleteById(id);
    }

    public void UpdateCar(Car car, long id) {
        garageRepository.save(car);
    }
}
