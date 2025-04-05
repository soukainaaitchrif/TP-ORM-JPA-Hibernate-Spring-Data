package ma.enset.tp2_ormjpahibernatespringdata.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class JPAPatient {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Marks the primary key
    private Long id;
    private String nom;
    private Date dateNaissance;
    private Boolean malade;
    private int score;

}
