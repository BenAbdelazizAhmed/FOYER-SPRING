package tn.esprit.tp_foye;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class bloc {
    @Id
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
}
