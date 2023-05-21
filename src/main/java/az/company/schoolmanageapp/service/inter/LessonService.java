package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Lessons;
import model.dto.LessonsDto;
import model.dto.StudentsDto;

import java.util.List;

public interface LessonService {
    List<Object[]> getLessonsByStudentId(Integer studentId);
    List<LessonsDto> getAllLessons();
//    void addLesson(Lessons lesson);
}
