package marcos.filho.msraces.repository;

import marcos.filho.msraces.entity.Race;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RaceRepository extends MongoRepository<Race, String> {
}
