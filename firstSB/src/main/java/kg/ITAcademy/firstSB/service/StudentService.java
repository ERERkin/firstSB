package kg.ITAcademy.firstSB.service;

import kg.ITAcademy.firstSB.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getById(Long id);

    Student save(Student student);
}
