package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student extends User {
    private String groupe;
    private String niveauEtude;
    private String filiere;

}



/*
    @Override
    public void partagePublic(Message message) {
    }
 */
