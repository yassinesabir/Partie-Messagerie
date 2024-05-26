package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adresseMail;
    private String motDePasse;

    public void ajouterUtilisateur(User user) {

    }

    public void supprimerUtilisateur(User user){

    }
    public boolean seConnecter(String adresseMail, String motDePasse) {
        return Objects.equals(this.adresseMail, adresseMail) && Objects.equals(this.motDePasse, motDePasse);
    }

    public void seDeconnecter() {

    }
}
