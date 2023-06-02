package ra.springboot.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.springboot.dao.IStudentRepository;
import ra.springboot.model.Students;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Students save(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Students findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
