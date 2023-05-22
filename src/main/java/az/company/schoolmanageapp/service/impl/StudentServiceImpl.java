package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.exception.StudentNotFoundException;
import az.company.schoolmanageapp.mapper.StudentsMapper;
import az.company.schoolmanageapp.repository.StudentRepository;
import az.company.schoolmanageapp.service.inter.StudentService;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentsMapper studentsMapper;

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
        Students student = getStudentById(id);
        return studentsMapper.toDto(student);
    }

    @Override
    public Students getStudentById(Integer id) {
        Optional<Students> students = studentRepository.findById(id);
        if (students.isPresent()) {
            return (students.get());
        }
        throw new StudentNotFoundException("Student not found by id" + id);

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
        Students student=getStudentById(studentId);
        studentRepository.delete(student);
    }
}
