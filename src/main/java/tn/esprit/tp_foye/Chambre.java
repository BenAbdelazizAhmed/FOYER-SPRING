package tn.esprit.tp_foye;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Idchamber;
    private  int numerochambre;
    @Enumerated(EnumType.STRING)
    private  TypeChambre types ;
}
