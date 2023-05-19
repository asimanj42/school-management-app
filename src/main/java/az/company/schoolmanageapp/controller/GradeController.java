package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.entity.Grades;
import az.company.schoolmanageapp.service.inter.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("rest")
public class GradeController {

    private GradeService gradeService;

    @Autowired
    public GradeController(@Qualifier("gradeServiceImpl") GradeService gradeService) {
        this.gradeService=gradeService;
    }



    //has some issue/problem
    @PutMapping("grades")
    public void updateGrades(@RequestBody Grades grades) {
            gradeService.save(grades);
    }
}
