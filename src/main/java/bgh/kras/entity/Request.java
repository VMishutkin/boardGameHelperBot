package bgh.kras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Request {
@Id
    private String id;
    private Integer chatID;
    private String nickName;
    private RequestType requestType;
}
