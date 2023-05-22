package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.model.dto.StudentsDto;

import java.util.List;

public interface StudentService {
   List<Object[]> getStudentBySpecAndLesson();

   List<StudentsDto> getAllStudent();

    StudentsDto findById(Integer id);
    Students getStudentById(Integer id);
    void addStudent(StudentsDto student);
    void updateStudent(StudentsDto student);
    void removeStudent(Integer studentId);

}
