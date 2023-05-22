package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Grades;
import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.exception.GradeNotFoundException;
import az.company.schoolmanageapp.exception.StudentNotFoundException;
import az.company.schoolmanageapp.mapper.GradesMapper;
import az.company.schoolmanageapp.model.dto.GradesDto;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import az.company.schoolmanageapp.repository.GradeRepository;
import az.company.schoolmanageapp.service.inter.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("gradeServiceImpl")
public class GradeServiceImpl implements GradeService {
    private final GradeRepository gradeRepository;
    private final GradesMapper gradesMapper;

    @Autowired
    public GradeServiceImpl(GradeRepository gradeRepository, GradesMapper gradesMapper) {
        this.gradeRepository = gradeRepository;
        this.gradesMapper = gradesMapper;
    }


    @Override
    public List<GradesDto> getAllGrade() {
        List<Grades> grades = gradeRepository.findAll();
        List<GradesDto> result = gradesMapper.toDto(grades);
        return result;
    }

    @Override
    public GradesDto findById(Integer id) {
        Grades grades = getGradeById(id);
        return gradesMapper.toDto(grades);
    }

    @Override
    public Grades getGradeById(Integer id) {
        Optional<Grades> grades = gradeRepository.findById(id);
        if (grades.isPresent()) {
            return (grades.get());
        }
        throw new GradeNotFoundException("Grade not found by id" + id);

    }


    @Override
    public void addGrade(GradesDto grades) {
        gradeRepository.save(gradesMapper.toEntity(grades));
    }

    @Override
    public void updateGrade(GradesDto grade) {
        gradeRepository.save(gradesMapper.toEntity(grade));
    }

    @Override
    public void removeGrade(Integer gradeId) {
        Grades grades = getGradeById(gradeId);
        gradeRepository.delete(grades);
    }
}
