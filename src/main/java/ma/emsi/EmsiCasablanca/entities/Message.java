package ma.emsi.EmsiCasablanca.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "sender_type", discriminatorType = DiscriminatorType.STRING)
@Data @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public abstract class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTransmission;

    private String content;

    @Column(name = "sender_id")
    private Long senderId;

    @ManyToOne
    @JoinColumn(name = "message_file_id")
    private MessageFile messageFile;

    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channel channel;
}




