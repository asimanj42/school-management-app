package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Teacher;
import az.company.schoolmanageapp.mapper.TeacherMapper;
import az.company.schoolmanageapp.repository.TeacherRepository;
import az.company.schoolmanageapp.service.inter.TeacherService;
import model.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;
    private TeacherMapper teacherMapper;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository, TeacherMapper teacherMapper) {
        this.teacherRepository = teacherRepository;
        this.teacherMapper = teacherMapper;
    }

    @Override
    public List<Object[]> getTeachers() {
        return teacherRepository.getTeacherByLessonName();
    }

    @Override
    public List<TeacherDto> getAllTeacher() {
        List<Teacher> teacher = teacherRepository.findAll();
        List<TeacherDto> result=teacherMapper.toDto(teacher);
        return result;
    }

    @Override
    public TeacherDto findById(Integer id) {
        return null;
    }

    @Override
    public void addTeacher(TeacherDto teacher) {

    }

    @Override
    public void updateTeacher(TeacherDto teacher) {

    }

    @Override
    public void removeTeacher(Integer teacherId) {

    }

}
