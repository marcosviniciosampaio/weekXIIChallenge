package marcos.filho.mscars.repository;

import marcos.filho.mscars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface CarRepository extends MongoRepository<Car, String> {

    boolean existsByPilotNameAndPilotAge(String pilotName, int pilotAge);

    boolean exitsByBrandAndModelAndYear(String brand, String model, Date year);
}
