package marcos.filho.mscars.infra.repository;

import marcos.filho.mscars.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
