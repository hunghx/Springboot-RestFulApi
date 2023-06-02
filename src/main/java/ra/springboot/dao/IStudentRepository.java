package ra.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.springboot.model.Students;

public interface IStudentRepository extends JpaRepository<Students,Long> {

}
