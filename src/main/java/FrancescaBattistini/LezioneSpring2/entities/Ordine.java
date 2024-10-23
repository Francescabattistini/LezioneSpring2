package FrancescaBattistini.LezioneSpring2.entities;

import FrancescaBattistini.LezioneSpring2.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/*LocalDateTime = rappresenta una data e un'ora (ad esempio, 23 ottobre 2024 alle 15:30:45).
LocalDate = rappresenta solo una data (ad esempio, 23 ottobre 2024), senza l'informazione relativa all'ora.*/

@Getter
@Setter
public class Ordine {
    private Tavolo tavolo; // L'ordine è associato a un tavolo
    private List<DettagliMenu> elemntiMenu; // numero arbitrario di elementi menu
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime OraOrdine;
    private int costoCoperto;
// modifico il costrutto perchè così gli do dei valori predefiniti di partenza che poi cambierò in seguito.

    public Ordine(Tavolo tavolo, int numeroOrdine, int numeroCoperti,int costoCoperto) {
        this.tavolo = tavolo;
        this.elemntiMenu = elemntiMenu;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.OraOrdine = LocalDateTime.now();// Ottenere l'ora e la data corrente  che non ha fuso orario
        this.costoCoperto = costoCoperto; // lo prenderò dall'aplication.properties
        //ordine.setStatoOrdine(StatoOrdineType.PRONTO); per cambiarlo
    }

    // prendiamo ordine del tavolo


}
