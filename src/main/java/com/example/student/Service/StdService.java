package com.example.student.Service;

import com.example.student.dto.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdService {

    @Autowired
    StudentRepository stdRepository;

    public List<Student> getAll(){
        //return stdRepository.getAll();
        return (List<Student>) stdRepository.findAll();
    }

    public Student add(Student std) {
        return stdRepository.save(std);
    }

    public Student edit(Student std) {
        return stdRepository.save(std);

    }
    public void delete(int stdNo) {
        stdRepository.deleteById(stdNo);
    }
}
