package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.mapper.StudentsMapper;
import az.company.schoolmanageapp.repository.StudentRepository;
import az.company.schoolmanageapp.service.inter.StudentService;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private StudentsMapper studentsMapper;

    @Autowired
    public StudentServiceImpl(
            StudentRepository studentRepository, StudentsMapper studentsMapper) {
        this.studentRepository = studentRepository;
        this.studentsMapper = studentsMapper;
    }


    @Override
    public List<Object[]> getStudentBySpecAndLesson() {
        return studentRepository.findStudentInfoWithSpecializationAndLessons();
    }

    @Override
    public List<StudentsDto> getAllStudent() {
        List<Students> students = studentRepository.findAll();
        List<StudentsDto> result = studentsMapper.toDto(students);
        return result;
    }

    @Override
    public StudentsDto findById(Integer id) {
        Students students = studentRepository.findStudentById(id);
        return studentsMapper.toDto(students);
    }

    @Override
    public void addStudent(StudentsDto student) {
        studentRepository.save(studentsMapper.toEntity(student));
    }

    @Override
    public void updateStudent(StudentsDto student) {
        studentRepository.save(studentsMapper.toEntity(student));
    }

    @Override
    public void removeStudent(Integer studentId) {
        Students student = studentRepository.findStudentById(studentId);
        studentRepository.delete(student);
    }

//    @Override
//    public void addStudent(Students student) {
//
//        studentRepository.save(student);
//    }
}
