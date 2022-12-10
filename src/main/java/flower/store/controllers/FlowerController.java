package flower.store.controllers;

import flower.store.items.Flower;
import flower.store.items.FlowerColor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(FlowerColor.GREEN, 5.0, 90), new Flower(FlowerColor.RED, 3, 130));
    }
}
