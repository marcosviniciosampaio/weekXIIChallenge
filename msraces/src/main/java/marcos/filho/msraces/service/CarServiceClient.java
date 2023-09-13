package marcos.filho.msraces.service;

import marcos.filho.msraces.payload.CarDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ms-cars", url = "localhost: 8080")
public interface CarServiceClient {

    @GetMapping("/api/car")
    public List<CarDtoResponse> getAllCars();
}
