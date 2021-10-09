package lucas.springbootdvega.model;

/*
Represents a table in a database.

 */

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
}
