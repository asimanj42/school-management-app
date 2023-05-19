package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Teacher;
import az.company.schoolmanageapp.repository.TeacherRepository;
import az.company.schoolmanageapp.service.inter.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Object[]> getTeachers() {
        return teacherRepository.getTeacherByLessonName();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
