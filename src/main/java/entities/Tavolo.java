package entities;

import enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int numerotavolo;
    private int numeroCoperti;
    private StatoTavolo statotavolo;

}
