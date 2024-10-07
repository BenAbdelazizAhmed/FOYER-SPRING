package tn.esprit.tp_foye;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;
}
