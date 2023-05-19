package az.company.schoolmanageapp.controller;


import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.service.inter.LessonService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")
public class LessonController {

    private LessonService lessonService;

    @Autowired
    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;

    }

    @GetMapping("/lessons/{studentId}")
    public ResponseEntity<List<Object[]>> getLessonsByStudentId(@PathVariable Integer studentId) {
        List<Object[]> lessonsData = lessonService.getLessonsByStudentId(studentId);
        return ResponseEntity.ok(lessonsData);
    }

    @PostMapping("/lessons")
    public void addLessons(@RequestBody Lessons lesson) {
        lesson.setId(0);
        lessonService.addLesson(lesson);
    }


}
