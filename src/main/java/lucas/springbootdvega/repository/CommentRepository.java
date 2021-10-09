package lucas.springbootdvega.repository;

import lucas.springbootdvega.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
