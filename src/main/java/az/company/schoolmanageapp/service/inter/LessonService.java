package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.model.dto.LessonsDto;

import java.util.List;

public interface LessonService {
    List<Object[]> getLessonsByStudentId(Integer studentId);

    List<LessonsDto> getAllLessons();

    Lessons getLessonById(Integer id);

    LessonsDto findById(Integer id);

    void addLesson(LessonsDto lesson);

    void updateLesson(LessonsDto lesson);

    void removeLesson(Integer lessonId);
//    void addLesson(Lessons lesson);
}
