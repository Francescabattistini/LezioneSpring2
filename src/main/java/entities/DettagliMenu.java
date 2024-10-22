package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class DettagliMenu {
    protected String name;
    protected int calories;
    protected Double price;

public abstract void stampaDettaglicibo();
}
