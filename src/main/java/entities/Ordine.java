package entities;

import enums.StatoOrdine;

import java.time.LocalDate;
import java.util.List;

public class Ordine {
    int numeroTavolo;// L'ordine è associato a un tavolo
    List<DettagliMenu> elemntiMenu; // numero aritrario di elementi menu
    int numeroOrdine;
    StatoOrdine statoOrdine;
    int numeroCoperti;
    LocalDate OraOrdine;



}
