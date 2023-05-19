package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Students;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Students> findAll();
   List<Object[]> getStudentBySpecAndLesson();

    Students findById(Integer id);

    void addStudent(Students student);
}
