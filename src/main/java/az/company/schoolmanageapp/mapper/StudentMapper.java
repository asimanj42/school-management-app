package az.company.schoolmanageapp.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private ModelMapper modelMapper;

    @Autowired
    public StudentMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public StudentDto toStudentDto(Student student) {
        return modelMapper.map(student, StudentDto.class);
    }
}