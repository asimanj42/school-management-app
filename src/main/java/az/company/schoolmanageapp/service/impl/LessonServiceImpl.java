package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.mapper.LessonsMapper;
import az.company.schoolmanageapp.repository.LessonRepository;
import az.company.schoolmanageapp.repository.StudentRepository;
import az.company.schoolmanageapp.service.inter.LessonService;
import model.dto.LessonsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {
    private LessonRepository lessonRepository;
    private LessonsMapper lessonsMapper;

    @Autowired
    public LessonServiceImpl(LessonRepository lessonRepository, LessonsMapper lessonsMapper) {
        this.lessonRepository = lessonRepository;
        this.lessonsMapper = lessonsMapper;
    }

    @Override
    public List<Object[]> getLessonsByStudentId(Integer studentId) {
        return lessonRepository.findLessonsByStudentId(studentId);
    }

    @Override
    public List<LessonsDto> getAllLessons() {
        List<Lessons> lessons = lessonRepository.findAll();
        List<LessonsDto> result = lessonsMapper.toDto(lessons);
        return result;
    }

//    @Override
//    public void addLesson(Lessons lesson) {
//        lessonRepository.save(lesson);
//    }
}
