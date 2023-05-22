package az.company.schoolmanageapp.controller;


import az.company.schoolmanageapp.service.inter.LessonService;
import az.company.schoolmanageapp.model.dto.LessonsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest")
public class LessonController {

    private final LessonService lessonService;

    @Autowired
    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;

    }

    @GetMapping("/lessons/{studentId}")
    public ResponseEntity<List<Object[]>> getLessonsByStudentId(@PathVariable Integer studentId) {
        List<Object[]> lessonsData = lessonService.getLessonsByStudentId(studentId);
        return ResponseEntity.ok(lessonsData);
    }

    @GetMapping("lessons")
    public List<LessonsDto> getAllLessons() {
        return lessonService.getAllLessons();
    }

    @PostMapping("lessons")
    public void addLesson(@RequestBody LessonsDto lesson) {
        lesson.setId(0);
        lessonService.addLesson(lesson);
    }

    @PutMapping("lessons")
    public void updateLesson(@RequestBody LessonsDto lesson) {
        lessonService.updateLesson(lesson);
    }

    @DeleteMapping("lesson/{lessonId}")
    public void removeLesson(@PathVariable Integer lessonId) {
        lessonService.removeLesson(lessonId);
    }


}
