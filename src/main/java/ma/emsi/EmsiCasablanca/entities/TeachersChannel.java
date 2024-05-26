package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "teachersChannel")
public class TeachersChannel extends Channel{
    @OneToMany(mappedBy = "channel")
    private Set<Message> contenue;
}
