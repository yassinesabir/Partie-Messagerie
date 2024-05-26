package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "studentsChannel")
public class StudentsChannel extends Channel{
    @OneToMany(mappedBy = "channel")
    private Set<Message> contenue;
}
