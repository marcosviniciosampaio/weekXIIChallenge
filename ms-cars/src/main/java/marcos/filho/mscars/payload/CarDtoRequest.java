package marcos.filho.mscars.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
public class CarDtoRequest {

    private String brand;
    private String model;
    @JsonFormat(pattern = "yyyy")
    private Date year;
    private PilotDto pilotDto;

    public CarDtoRequest(){}
    public CarDtoRequest(String brand, String model, Date year, PilotDto pilotDto) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pilotDto = pilotDto;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public PilotDto getPilotDto() {
        return pilotDto;
    }

    public void setPilotDto(PilotDto pilotDto) {
        this.pilotDto = pilotDto;
    }
}
