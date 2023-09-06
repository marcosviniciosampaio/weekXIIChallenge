package marcos.filho.mscars.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cars")
public class CarsResource {
    @GetMapping
    public String status(){
        return "ok";
    }
}
