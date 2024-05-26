package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String numeroTelephone;
    private String adresseMail;
    private String motDePasse;
}





/*
    public abstract void partagePublic(Message message);
    public boolean seConnecter(String adresseMail, String motDePasse){
        return Objects.equals(this.adresseMail, adresseMail) && Objects.equals(this.motDePasse, motDePasse);
    };
    public void seDeconnecter(boolean isConnected){
        if (isConnected) {
            System.out.println("Déconnexion réussie.");
        } else {
            System.out.println("L'utilisateur n'est pas connecté.");
        }
    };
 */