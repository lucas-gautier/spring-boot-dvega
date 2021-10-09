package lucas.springbootdvega.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor // Lombok generates "public Vote() {};" code for us
@Data
@Entity
public class Vote {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    // user
    // link
}
