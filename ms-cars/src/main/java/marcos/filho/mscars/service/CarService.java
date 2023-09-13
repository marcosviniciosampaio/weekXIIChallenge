package marcos.filho.mscars.service;

import marcos.filho.mscars.entity.Car;
import marcos.filho.mscars.entity.Pilot;
import marcos.filho.mscars.exception.ApiRequestException;
import marcos.filho.mscars.payload.CarDtoRequest;
import marcos.filho.mscars.payload.CarDtoResponse;
import marcos.filho.mscars.payload.PilotDto;
import marcos.filho.mscars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    Pilot pilot;

    public Car save(CarDtoRequest carDtoRequest){
        Car car = new Car(
                null,
                carDtoRequest.getBrand(),
                carDtoRequest.getModel(),
                carDtoRequest.getYear(),
                carDtoRequest.getPilot()
        );
        if(carRepository.existsByPilotNameAndPilotAge(pilot.getName(), pilot.getAge()) &&
                carRepository.existsByBrandAndModelAndYear(carDtoRequest.getBrand(), carDtoRequest.getModel(), carDtoRequest.getYear())){
            carRepository.save(car);
            return car;
        }else{
            throw new ApiRequestException("");
        }
    }


    public CarDtoResponse getById(String id){
        Car car =
        carRepository.findById(id).orElseThrow(()-> new ApiRequestException(""));

        CarDtoResponse carDtoResponse = new CarDtoResponse(
                car.getId(),
                car.getBrand(),
                car.getModel(),
                car.getYear(),
                car.getPilot()
        );
        return carDtoResponse;

    }

    public Car updatedCar(String id, Car updatedCar){
        if (carRepository.existsById(id)){
            updatedCar.setId(id);
            return carRepository.save(updatedCar);
        }
        throw new ApiRequestException(" cannot be found");
    }
    public void deleteCar(String id){
        if(carRepository.existsById(id)){
            carRepository.deleteById(id);
        }else{
            throw new ApiRequestException(" cannot be found");
        }
    }
}

