package lucas.springbootdvega.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    // link
    @ManyToOne
    private Link link;
}
