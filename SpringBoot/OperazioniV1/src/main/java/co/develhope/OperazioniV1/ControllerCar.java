package co.develhope.OperazioniV1;

import co.develhope.OperazioniV1.CarType;
import co.develhope.OperazioniV1.CarColor;
import co.develhope.OperazioniV1.Car;
import co.develhope.OperazioniV1.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/cars")
public class ControllerCar {

    @Autowired
    private CarRepository carRepository;

    //POST PUNTO 1
    @PostMapping
    public Car create(@RequestBody Car car) {
        return carRepository.save(car);
    }

    //GET PUNTO 2
    @GetMapping
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    //GET CON ID PUNTO 3
    @GetMapping("/{id}")
    public ResponseEntity<Car> getOne(@PathVariable Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(car.get());
    }

    //AGGIORNA PUNTO 4
    @PutMapping("/{id}")
    public ResponseEntity<Car> updateType(@PathVariable Long id, @RequestParam CarType Newtype) {
        if (!carRepository.existsById(id)) {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        Car car = carRepository.findById(id).get();
        car.setType(Newtype);
        return ResponseEntity.ok(carRepository.save(car));
    }

    //CANCELLA CON ID PUNTO 5
    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteOne(@PathVariable Long id) {
        if (!carRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        carRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    //CANCELLA TUTTE LE CARS PUNTO 6
    @DeleteMapping
    public ResponseEntity<Void> deleteAll() {
        carRepository.deleteAll();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
