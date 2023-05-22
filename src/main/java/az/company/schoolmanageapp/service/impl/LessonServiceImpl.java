package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.exception.LessonNotFoundException;
import az.company.schoolmanageapp.mapper.LessonsMapper;
import az.company.schoolmanageapp.repository.LessonRepository;
import az.company.schoolmanageapp.service.inter.LessonService;
import az.company.schoolmanageapp.model.dto.LessonsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonService {
    private final LessonRepository lessonRepository;
    private final LessonsMapper lessonsMapper;

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

    @Override
    public LessonsDto findById(Integer id) {
        Lessons lesson = getLessonById(id);
        return lessonsMapper.toDto(lesson);
    }

    @Override
    public Lessons getLessonById(Integer id) {
        Optional<Lessons> lessons = lessonRepository.findById(id);
        if (lessons.isPresent()) {
            return (lessons.get());
        }
        throw new LessonNotFoundException("Lesson not found by id" + id);
    }


    @Override
    public void addLesson(LessonsDto lesson) {
        lessonRepository.save(lessonsMapper.toEntity(lesson));
    }

    @Override
    public void updateLesson(LessonsDto lesson) {
        lessonRepository.save(lessonsMapper.toEntity(lesson));
    }

    @Override
    public void removeLesson(Integer lessonId) {
        Lessons lesson = getLessonById(lessonId);
        lessonRepository.delete(lesson);
    }
}
