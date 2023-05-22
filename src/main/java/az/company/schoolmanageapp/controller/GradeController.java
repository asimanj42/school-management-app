package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.model.dto.GradesDto;
import az.company.schoolmanageapp.service.inter.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("rest")
public class GradeController {

    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("grades")
    public List<GradesDto> getAllGrade() {
        return gradeService.getAllGrade();
    }

//    @GetMapping("grades/{gradeId}")
//    public StudentsDto getGradeByGradeId(@PathVariable Integer studentId) {
//        return studentService.findById(studentId);
//    }

    @PostMapping("grades")
    public void addGrade(@RequestBody GradesDto grades) {
        grades.setId(0);
        gradeService.addGrade(grades);
    }

    //has some issue/problem
    @PutMapping("grades")
    public void updateGrades1(@RequestBody GradesDto grades) {
        gradeService.updateGrade(grades);
    }

    @DeleteMapping("grades/{gradeId}")
    public void removeGrade(@PathVariable Integer gradeId) {
        gradeService.removeGrade(gradeId);
    }


}
