package lucas.springbootdvega.model;

/*
Represents a table in a database.

 */

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Link extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // Link
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
