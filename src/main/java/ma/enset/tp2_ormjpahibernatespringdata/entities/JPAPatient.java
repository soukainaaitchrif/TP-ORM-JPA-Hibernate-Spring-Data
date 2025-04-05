package ma.enset.tp2_ormjpahibernatespringdata.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
public class JPAPatient {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Marks the primary key
    private Long id;
    private String nom;
    private Date dateNaissance;
    private Boolean malade;
    private int score;

    public JPAPatient(Long id, String nom, Date dateNaissance, Boolean malade, int score) {
        this.score = score;
        this.malade = malade;
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.id = id;
    }

    public JPAPatient() {
    }
}
