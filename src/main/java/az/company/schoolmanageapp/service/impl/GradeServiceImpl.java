package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Grades;
import az.company.schoolmanageapp.repository.GradeRepository;
import az.company.schoolmanageapp.service.inter.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("gradeServiceImpl")
public class GradeServiceImpl implements GradeService {
    private GradeRepository gradeRepository;
//    private StudentRepository studentRepository;
//    private LessonRepository lessonRepository;

    @Autowired
    public GradeServiceImpl(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
//        this.studentRepository=studentRepository;
//        this.lessonRepository=lessonRepository;
    }

    @Transactional
    @Override
    public void save(Grades grades) {
        gradeRepository.save(grades);
    }

}
