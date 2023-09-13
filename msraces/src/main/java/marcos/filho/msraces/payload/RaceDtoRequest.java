package marcos.filho.msraces.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import marcos.filho.msraces.entity.RaceStatus;

import java.util.Date;
import java.util.List;

public class RaceDtoRequest {

    @Id
    private String id;
    private String name;
    private String country;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @Enumerated(value = EnumType.STRING)
    private RaceStatus status;
    private List<CarDtoResponse> cars;

    public RaceDtoRequest( String name, String country, Date date, RaceStatus status, List<CarDtoResponse> cars) {
        this.name = name;
        this.country = country;
        this.date = date;
        this.status = status;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public RaceStatus getStatus() {
        return status;
    }

    public void setStatus(RaceStatus status) {
        this.status = status;
    }

    public List<CarDtoResponse> getCars() {
        return cars;
    }

    public void setCars(List<CarDtoResponse> cars) {
        this.cars = cars;
    }

    public RaceDtoRequest(){}

}
