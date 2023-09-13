package marcos.filho.msraces.service;

import marcos.filho.msraces.entity.Race;
import marcos.filho.msraces.entity.RaceStatus;
import marcos.filho.msraces.exception.ApiRequestException;
import marcos.filho.msraces.payload.CarDtoResponse;
import marcos.filho.msraces.payload.RaceDtoRequest;
import marcos.filho.msraces.payload.RaceDtoResponse;
import marcos.filho.msraces.repository.RaceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RaceService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RaceRepository raceRepository;
    private CarServiceClient carServiceClient;

    @Autowired
    public RaceService(CarServiceClient carServiceClient) {
        this.carServiceClient = carServiceClient;

    }

    public List<CarDtoResponse> getRandomCarsForRace() {
        List<CarDtoResponse> allCars = carServiceClient.getAllCars();

        Collections.shuffle(allCars);

        Random random = new Random();
        int numCarsToSelect = random.nextInt(8) + 3;

        List<CarDtoResponse> selectedCars = new ArrayList<>();

        for (int i = 0; i < numCarsToSelect && i < allCars.size(); i++) {
            CarDtoResponse randomCar = allCars.get(i);
            selectedCars.add(randomCar);

        }
        return selectedCars;
    }

    public Race createRace(RaceDtoRequest raceDtoRequest) {
        List<CarDtoResponse> randomCars = getRandomCarsForRace();
        if (raceDtoRequest.getStatus().equals(RaceStatus.WAITING)) {
            raceDtoRequest.setCars(randomCars);
            Race race = new Race(
                    null,
                    raceDtoRequest.getName(),
                    raceDtoRequest.getCountry(),
                    raceDtoRequest.getDate(),
                    raceDtoRequest.getStatus(),
                    raceDtoRequest.getCars()
            );
            raceRepository.save(race);
            return race;
        }else{
            throw new ApiRequestException("invalid Request");
        }


    }
}
