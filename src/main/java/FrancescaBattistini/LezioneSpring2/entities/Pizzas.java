package FrancescaBattistini.LezioneSpring2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
public class Pizzas extends DettagliMenu {
    private List<Toppings> toppings;

    public Pizzas(String name, int calories, Double price) {
        super(name, calories, price);
        this.toppings = new ArrayList<>();// è []
    }

    public void addToppings(Toppings top){ //aggiungo i Topping alla pizza  quando richiamato
        this.toppings.add(top);
    }

    @Override
    public void stampaDettaglicibo() {
        System.out.println("La pizza " + getName());
        System.out.println("La pizza " + getCalories());
        System.out.println("La pizza " + getPrice());
        System.out.println("il topping è: ");
        for (Toppings toppings:toppings){
            System.out.println(" - " + toppings.getName());
        }
    }
}
