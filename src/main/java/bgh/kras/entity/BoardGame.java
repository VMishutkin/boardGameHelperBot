package bgh.kras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

@Data
@Entity
public class BoardGame {
    @Id
    private Integer id;
    private String description;

}
