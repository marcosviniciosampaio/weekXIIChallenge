package marcos.filho.msraces.payload;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CarDtoResponse {


    private String id;
    private String brand;
    private String model;
    @JsonFormat(pattern = "yyyy")
    private Date year;
    private PilotDto pilot;

    public CarDtoResponse(){}

    public CarDtoResponse(String id, String brand, String model, Date year, PilotDto pilot) {
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

    public PilotDto getPilot() {
        return pilot;
    }

    public void setPilot(PilotDto pilot) {
        this.pilot = pilot;
    }
}


