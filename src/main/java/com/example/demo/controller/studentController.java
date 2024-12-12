package com.example.demo.controller;
import com.example.demo.models.ConnectDB;
import com.example.demo.models.Student;
import com.example.demo.Services.studentServices;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentController {

    private studentServices studentService= new studentServices();

    public String info(){
        return "the application is up";
    }
    @GetMapping("/student")
    public String getStudentById(@RequestParam (value = "id", defaultValue = "2") String id) {

        Student student= studentService.getStudentById(id);
        return String.format("Hello %s!", student.getName());
    }
}
