package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher extends User{
}



/*

    @Override
    public void partagePublic(Message message) {

    }
    public void partageDocuments(MessageFile file) {

    }
 */