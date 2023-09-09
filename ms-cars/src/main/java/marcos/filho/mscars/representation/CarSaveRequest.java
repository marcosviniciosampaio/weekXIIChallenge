package marcos.filho.mscars.representation;

import lombok.Data;
import marcos.filho.mscars.domain.Car;
import marcos.filho.mscars.domain.Pilot;
@Data
public class CarSaveRequest {
    private String brand;
    private String model;
    private Pilot pilot;
    private String year_production;

    public Car toModel(){
        return new Car(null, brand, model, pilot, year_production);
    }
}
