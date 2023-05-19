package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.StudentDto;
import az.company.schoolmanageapp.entity.Students;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentsMapper {
    Students toEntity(StudentDto studentDto);

    StudentDto toDto(Students students);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Students partialUpdate(StudentDto studentDto, @MappingTarget Students students);
}