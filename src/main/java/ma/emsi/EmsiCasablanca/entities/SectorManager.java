package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "managers")
public class SectorManager extends User{
    private String niveauAffiliation;
    private String filiere;
}




/*

    @Override
    public void partagePublic(Message message) {

    }
    public void partageActualites(Message message) {

    }
 */