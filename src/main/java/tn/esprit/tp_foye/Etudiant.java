package tn.esprit.tp_foye;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Getter
@Setter
public class Etudiant {
@Id
    private Long idEtudiant;
    private String nomEt;
    private String prenomET;
    private Long cin;
    private String ecole;
    private Date DateNaissance;
}
