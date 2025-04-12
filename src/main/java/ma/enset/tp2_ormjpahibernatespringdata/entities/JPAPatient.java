package ma.enset.tp2_ormjpahibernatespringdata.entities;

import jakarta.persistence.*;
import lombok.Data;

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
    public String toString(){
        System.out.println("Nom: " + nom);
        System.out.println("Date Naissance: " + dateNaissance);
        System.out.println("Malade: " + malade);
        System.out.println("Score: " + score);


        return null;
    }
}
