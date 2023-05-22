package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.service.inter.StudentService;
import az.company.schoolmanageapp.model.dto.StudentsDto;
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


    @GetMapping("studentsdata")
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

    @GetMapping("students")
    public List<StudentsDto> getAllStudents() {
        return studentService.getAllStudent();
    }

    @GetMapping("students/{studentId}")
    public StudentsDto getStudentByStudentId(@PathVariable Integer studentId) {
        return studentService.findById(studentId);
    }

    @PostMapping("student")
    public void addStudent(@RequestBody StudentsDto student) {
        student.setId(0);
        studentService.addStudent(student);
    }

    @PutMapping("student")
    public void updateStudent(@RequestBody StudentsDto student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("student/{studentId}")
    public void removeStudent(@PathVariable Integer studentId) {
        studentService.removeStudent(studentId);
    }


}
