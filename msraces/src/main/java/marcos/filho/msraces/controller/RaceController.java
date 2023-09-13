package marcos.filho.msraces.controller;

import marcos.filho.msraces.entity.Race;
import marcos.filho.msraces.payload.RaceDtoRequest;
import marcos.filho.msraces.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/races")
public class RaceController {
    @Autowired
    RaceService raceService;
    @PostMapping("/start")
    public Race post(@RequestBody RaceDtoRequest raceDtoRequest){
        return raceService.createRace(raceDtoRequest);
    }
}
