package marcos.filho.mscars.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import marcos.filho.mscars.entity.Pilot;

import java.util.Date;
public class CarDtoRequest {

    private String brand;
    private String model;
    @JsonFormat(pattern = "yyyy")
    private Date year;
    private Pilot pilot;

    public CarDtoRequest(){}
    public CarDtoRequest(String brand, String model, Date year, Pilot pilot) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pilot = pilot;
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

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
}
