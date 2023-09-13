package marcos.filho.mscars.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "car")
public class Car {

    @Id
    private String id;

    private String brand;
    private String model;
    @JsonFormat(pattern = "yyyy")
    private Date year;

    private Pilot pilot;

    public Car(){
    }
    public Car(String id, String brand, String model, Date year, Pilot pilot){
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
