package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Students;
import model.dto.StudentsDto;

import java.util.List;

public interface StudentService {
//    List<StudentDto> findAll();
   List<Object[]> getStudentBySpecAndLesson();

   List<StudentsDto> getAllStudent();

    StudentsDto findById(Integer id);
    void addStudent(StudentsDto student);
}
