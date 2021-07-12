package com.example.student.controller;

import com.example.student.Service.StdService;
import com.example.student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/std")
public class StdController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    StdService stdService;

    @GetMapping("/get/all")
    public List<Student> getAll() {
        return stdService.getAll();
    }

    @PostMapping("/add")
    public Student add(@RequestBody Student std) {
        return stdService.add(std);
    }

    @PostMapping("/edit")
    public Student edit(@RequestBody Student std) {
        return stdService.edit(std);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int stdNo) {
        stdService.delete(stdNo);
    }
}
