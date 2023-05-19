package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.repository.LessonRepository;
import az.company.schoolmanageapp.repository.StudentRepository;
import az.company.schoolmanageapp.service.inter.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {
    private LessonRepository lessonRepository;

    @Autowired
    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public List<Object[]>  getLessonsByStudentId(Integer studentId) {
        return lessonRepository.findLessonsByStudentId(studentId);
    }

    @Override
    public void addLesson(Lessons lesson) {
        lessonRepository.save(lesson);
    }
}
