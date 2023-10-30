package com.github.brucemelo.springmicrostream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequestMapping("students")
@RestController
public class StudentController {

    @Autowired
    Data data;

    @GetMapping
    public List<Student> students() {
        return data.getStudents();
    }

    @PostMapping
    public Student saveBruce(@RequestBody Student student) {
        return data.saveStudent(student);
    }

}
