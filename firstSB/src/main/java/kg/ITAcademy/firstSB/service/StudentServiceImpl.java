package kg.ITAcademy.firstSB.service;

import kg.ITAcademy.firstSB.entity.Student;
import kg.ITAcademy.firstSB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(new Student());
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
