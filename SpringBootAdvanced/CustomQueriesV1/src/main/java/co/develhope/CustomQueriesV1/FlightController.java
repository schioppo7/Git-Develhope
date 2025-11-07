package co.develhope.CustomQueriesV1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;
    private final Random random = new Random();

    @PostMapping("/provision")
    public List<FlightEntity> provisionFlights(@RequestParam(defaultValue = "50") int n) {
        List<FlightEntity> flightEntities = random.ints(n, 0, 50)
                .mapToObj(i -> {
                    FlightEntity flight = new FlightEntity();
                    flight.setDescription("Flight" + i);
                    flight.setFromAirport("FROM" + i);
                    flight.setToAirport("TO" + i);
                    flight.setStatus(StatusEnum.ONTIME);
                    return flight;
                })
                .collect(Collectors.toCollection(ArrayList::new));
        return flightRepository.saveAll(flightEntities);
    }

    @GetMapping
    public List<FlightEntity> getAllFlights() {
        return flightRepository.findAll();
    }
}
