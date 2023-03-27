package bgh.kras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Table {
    @Id
    private Integer id;
    private String game;
    private LocalDateTime dateTime;
    @ManyToOne
    private Player host;
    private String place;
    private int slotsNumber;
    @ManyToMany
    private List<Player> players;
    private Integer topicId;
    private String description;

}
