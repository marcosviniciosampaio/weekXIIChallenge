package marcos.filho.mscars.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "pilot")
public class Pilot {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private int age;
}
