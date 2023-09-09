package marcos.filho.mscars.application;

import marcos.filho.mscars.domain.Car;
import marcos.filho.mscars.infra.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Car save(Car car){
        return repository.save(car);

    }

    public Optional<Car> getById(Long id){
        return repository.findById(id);
    }
}

