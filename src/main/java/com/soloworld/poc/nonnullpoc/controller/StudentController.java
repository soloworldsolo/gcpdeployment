package com.soloworld.poc.nonnullpoc.controller;

import com.soloworld.poc.nonnullpoc.model.Student;
import com.soloworld.poc.nonnullpoc.service.IStudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private IStudentService iStudentService;
  @GetMapping("/")
  public List<Student> getStudents() {
     return iStudentService.getStudents();
  }

}
