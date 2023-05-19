package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("students")
    public ResponseEntity<List<Map<String, Object>>> getStudents() {
        List<Map<String, Object>> result = new ArrayList<>();
        List<Object[]> studentsData = studentService.getStudentBySpecAndLesson();
        for (Object[] student : studentsData) {
            Map<String, Object> studentMap = new HashMap<>();
            studentMap.put("name", student[0]);
            studentMap.put("specialization", student[1]);
            studentMap.put("lessons", student[2]);
            result.add(studentMap);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Students student){
        student.setId(0);
        studentService.addStudent(student);
    }
}
