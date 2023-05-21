package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.service.inter.TeacherService;
import az.company.schoolmanageapp.model.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")
public class TeacherController {

    private TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("teacher")
    public ResponseEntity<List<Map<String, Object>>> getTeachers() {
        List<Map<String, Object>> result = new ArrayList<>();
        List<Object[]> teachersData = teacherService.getTeachers();
        for (Object[] teacher : teachersData) {
            Map<String, Object> teacherMap = new HashMap<>();
            teacherMap.put("name", teacher[0]);
            teacherMap.put("surname", teacher[1]);
            teacherMap.put("lesson", teacher[2]);
            result.add(teacherMap);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("teachers")
    public List<TeacherDto> getAllTeachers() {
        return teacherService.getAllTeacher();
    }
//    @PostMapping("/teacher")
//    public void addLessons(@RequestBody Teacher teacher) {
//        teacher.setId(0);
//        teacherService.addTeacher(teacher);
//    }
}
