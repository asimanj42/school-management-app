package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.entity.Teacher;
import az.company.schoolmanageapp.exception.StudentNotFoundException;
import az.company.schoolmanageapp.exception.TeacherNotFoundException;
import az.company.schoolmanageapp.mapper.TeacherMapper;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import az.company.schoolmanageapp.repository.TeacherRepository;
import az.company.schoolmanageapp.service.inter.TeacherService;
import az.company.schoolmanageapp.model.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;

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
        List<Teacher> teachers = teacherRepository.findAll();
        List<TeacherDto> result = teacherMapper.toDto(teachers);
        return result;
    }

    @Override
    public TeacherDto findById(Integer id) {
        Teacher teacher = getTeacherById(id);
        return teacherMapper.toDto(teacher);
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        if (teacher.isPresent()) {
            return (teacher.get());
        }
        throw new TeacherNotFoundException("Teacher not found by id" + id);

    }


    @Override
    public void addTeacher(TeacherDto teacher) {
        teacherRepository.save(teacherMapper.toEntity(teacher));
    }

    @Override
    public void updateTeacher(TeacherDto teacher) {
        teacherRepository.save(teacherMapper.toEntity(teacher));
    }

    @Override
    public void removeTeacher(Integer teacherId) {
        Teacher teacher=getTeacherById(teacherId);
        teacherRepository.delete(teacher);
    }

}


