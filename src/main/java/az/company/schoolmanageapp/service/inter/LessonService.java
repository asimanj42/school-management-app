package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.model.dto.LessonsDto;

import java.util.List;

public interface LessonService {
    List<Object[]> getLessonsByStudentId(Integer studentId);
    List<LessonsDto> getAllLessons();
//    void addLesson(Lessons lesson);
}
