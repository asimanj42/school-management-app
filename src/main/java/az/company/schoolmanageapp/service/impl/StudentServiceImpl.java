package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.repository.StudentRepository;
import az.company.schoolmanageapp.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Object[]> getStudentBySpecAndLesson() {
        return studentRepository.findStudentInfoWithSpecializationAndLessons();
    }

    @Override
    public Students findById(Integer id) {
        return studentRepository.findStudentById(id);

    }

    @Override
    public void addStudent(Students student) {
        studentRepository.save(student);
    }
}
