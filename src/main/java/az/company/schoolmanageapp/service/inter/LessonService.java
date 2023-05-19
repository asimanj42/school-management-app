package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Lessons;

import java.util.List;

public interface LessonService {
    List<Object[]> getLessonsByStudentId(Integer studentId);
    void addLesson(Lessons lesson);
}
