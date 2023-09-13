package marcos.filho.mscars.entity;


import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "pilot")
public class Pilot {
    @Id
    private String id;
    private String name;
    private int age;
    public Pilot(){}

    public Pilot(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
