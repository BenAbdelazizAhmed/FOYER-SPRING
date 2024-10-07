package tn.esprit.tp_foye;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Foyer {
    @Id
    private Long idFoyer;
    private String nomFoyer;
    private  Long capaciteFoyer;
}
