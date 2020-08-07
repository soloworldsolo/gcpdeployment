package com.soloworld.poc.nonnullpoc.service;

import com.soloworld.poc.nonnullpoc.model.Student;
import java.util.List;

public interface IStudentService {
  List<Student> getStudents();
  Student getStudent(long id);
}
