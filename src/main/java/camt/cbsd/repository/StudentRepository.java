package camt.cbsd.repository;

import camt.cbsd.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by CAMT on 4/7/2017.
 */
public interface StudentRepository extends CrudRepository<Student,Long>{
    Student findById(Long id);
}
