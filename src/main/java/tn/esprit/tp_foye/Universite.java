package tn.esprit.tp_foye;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Universite {
    @Id
    private Long idUniversite;
    private String nomUniversite;
    private String adress;
}
