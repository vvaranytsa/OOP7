package flower.store.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Flower {

    @Setter
    @Getter
    private FlowerColor color;
    @Getter
    @Setter
    private double sepalLength;
    @Getter
    @Setter
    private double price;

    public Flower(FlowerColor color, double price, double sepalLength) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}