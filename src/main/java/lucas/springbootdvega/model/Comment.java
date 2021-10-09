package lucas.springbootdvega.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    // link
}
