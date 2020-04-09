package kg.ITAcademy.firstSB.controller;

import kg.ITAcademy.firstSB.entity.Student;
import kg.ITAcademy.firstSB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student") // localhost:8080/student
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }


}
