package spring.garageApp.controller;

import spring.garageApp.model.Car;

import java.util.List;

import org.apache.logging.log4j.util.ProviderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.garageApp.service.GarageService;

@RestController
public class GarageController {

    // Injection de dépendance On inject les données de GarageService dans
    // GarageController
    @Autowired
    private GarageService garageService;

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public List<Car> getCars() {

        return garageService.getCars();
    }

    // le Path Variable
    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id) {
        return garageService.getCar(id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable long id) {
        garageService.deleteCar(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(@RequestBody Car car) {
        garageService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void UpdateCar(@RequestBody Car car, @PathVariable long id) {
        garageService.UpdateCar(car, id);
    }
}