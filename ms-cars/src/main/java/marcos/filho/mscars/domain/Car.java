package marcos.filho.mscars.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }
    @Column
    private String brand;

    @Column
    private String model;
    @Column
    private Pilot pilot;
    @Column
    private String year_production;

    public Car(Long id, String brand, String model, Pilot pilot, String year_production) {
    }
}
