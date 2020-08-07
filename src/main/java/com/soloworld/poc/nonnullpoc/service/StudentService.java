package com.soloworld.poc.nonnullpoc.service;

import com.soloworld.poc.nonnullpoc.model.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService  implements  IStudentService{

  @Override
  public List<Student> getStudents() {
    return createStudents();
  }

  private List<Student> createStudents() {
    Student student = new Student(1,"solomon",35,"Male");
    Student student1 = new Student(2,"null",35,null);

    return List.of(student,student1);
  }

  @Override
  public Student getStudent(long id) {
    return null;
  }
}
