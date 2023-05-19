package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Grades;
import az.company.schoolmanageapp.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface GradeService {
    void save(Grades grades);
}
