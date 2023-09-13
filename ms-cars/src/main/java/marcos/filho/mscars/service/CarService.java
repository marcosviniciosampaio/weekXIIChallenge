package marcos.filho.mscars.service;

import marcos.filho.mscars.entity.Car;
import marcos.filho.mscars.payload.CarDtoRequest;
import marcos.filho.mscars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public Car save(CarDtoRequest carDtoRequest){
        Car car = new Car(
                null,
                carDtoRequest.getBrand(),
                carDtoRequest.getModel(),
                carDtoRequest.getYear(),
                carDtoRequest.getPilot()
        );
    }
}

