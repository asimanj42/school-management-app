package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Specialization;
import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.exception.StudentNotFoundException;
import az.company.schoolmanageapp.mapper.SpecializationMapper;
import az.company.schoolmanageapp.model.dto.SpecializationDto;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import az.company.schoolmanageapp.repository.SpecializationRepository;
import az.company.schoolmanageapp.service.inter.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    private SpecializationRepository specializationRepository;
    private SpecializationMapper specializationMapper;

    @Autowired
    public SpecializationServiceImpl(SpecializationRepository specializationRepository, SpecializationMapper specializationMapper) {
        this.specializationRepository = specializationRepository;
        this.specializationMapper = specializationMapper;
    }

    @Override
    public List<Object[]> getSpecializations() {
        return specializationRepository.getSpecializationByLessonsList();
    }

    @Override
    public List<SpecializationDto> getAllSpecialization() {
        List<Specialization> specializations = specializationRepository.findAll();
        List<SpecializationDto> result = specializationMapper.toDto(specializations);
        return result;
    }

    @Override
    public SpecializationDto findById(Integer id) {
        Specialization specialization = getSpecializationById(id);
        return specializationMapper.toDto(specialization);
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
