package com.github.brucemelo.springmicrostream;

import one.microstream.integrations.spring.boot.types.Storage;
import one.microstream.storage.types.StorageManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Storage
public class Data {

    @Autowired
    private transient StorageManager storageManager;

    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public Student saveStudent(Student student) {
        students.add(student);
        storageManager.store(students);
        return student;
    }

}
