package marcos.filho.mscars.application;


import marcos.filho.mscars.domain.Car;
import marcos.filho.mscars.representation.CarSaveRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;


@RestController
@RequestMapping("cars")
public class CarsResource {
    @Autowired
    private final CarService service;
    public CarsResource(CarService service) {
        this.service = service;
    }

    @GetMapping
    public String status(){
        return "ok";
    }

    @PostMapping
    public ResponseEntity save(@RequestBody CarSaveRequest request){
        Car car = request.toModel();
        service.save(car);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("id={id}")
                .buildAndExpand(car.getId())
                .toUri();
        return ResponseEntity.created(headerLocation).build();

    }
@GetMapping(params = "id")
    public ResponseEntity dadosCar(Long id){
        var car = service.getById(id);
        if(car.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(car);

    }
}




