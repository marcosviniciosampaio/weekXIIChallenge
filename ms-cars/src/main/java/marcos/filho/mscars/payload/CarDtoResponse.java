package marcos.filho.mscars.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import marcos.filho.mscars.entity.Pilot;

import java.util.Date;


public class CarDtoResponse {

    private String id;
    private String brand;
    private String model;
    @JsonFormat(pattern = "yyyy")
    private Date year;
    private Pilot pilot;


    public CarDtoResponse(){}

    public CarDtoResponse(String id, String brand, String model, Date year, Pilot pilot) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pilot = pilot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
