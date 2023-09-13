package marcos.filho.mscars.controller;


import marcos.filho.mscars.entity.Car;
import marcos.filho.mscars.exception.ApiRequestException;
import marcos.filho.mscars.payload.CarDtoRequest;
import marcos.filho.mscars.payload.CarDtoResponse;
import marcos.filho.mscars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;


@RestController
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    CarService carService;
    @PostMapping("/post")
    public Car post(@RequestBody CarDtoRequest carDtoRequest){
        return carService.save(carDtoRequest);
    }

    @GetMapping("/get/{id}")
    public CarDtoResponse get(@PathVariable String id){
        return carService.getById(id);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable String id, @RequestBody Car updateCar){
        Car updated = carService.updatedCar(id, updateCar);
        if(updated != null){
            return ResponseEntity.ok(updated);
        }else{
            throw new ApiRequestException(" ");
        }
    }


}




