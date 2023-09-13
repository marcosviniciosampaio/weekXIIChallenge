package marcos.filho.mscars.repository;

import marcos.filho.mscars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface CarRepository extends MongoRepository<Car, String> {

    boolean existsByPilotNameAndPilotAge(String pilotName, int pilotAge);

    boolean existsByBrandAndModelAndYear(String brand, String model, Date year);
}
