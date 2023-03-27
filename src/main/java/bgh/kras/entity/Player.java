package bgh.kras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    private Integer id;
    private String name;
    private String telegramNickName;

}
