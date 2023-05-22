package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Grades;
import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.model.dto.GradesDto;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import az.company.schoolmanageapp.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface GradeService {

    List<GradesDto> getAllGrade();

    GradesDto findById(Integer id);
    Grades getGradeById(Integer id);
    void addGrade(GradesDto grade);
    void updateGrade(GradesDto grade);
    void removeGrade(Integer gradeId);
}
