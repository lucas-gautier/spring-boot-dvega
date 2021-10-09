package lucas.springbootdvega.repository;

import lucas.springbootdvega.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

/*
The JpaRepository class is a sub-class of CrudRepository that provides:
- A ton of basic functionality for CRUD database operations
- This interface brings in superclass functionality to reduce "boilerplate" code
- May not require additional methods in this interface, unless extra functionality is required

Interfaces in Spring do not need to be implemented because Spring will create proxy implementation classes at runtime
 */
public interface LinkRepository extends JpaRepository<Link,Long> {

    // example JPA module query, which derives query from method name
    //Link findByTitle(String title);
}
