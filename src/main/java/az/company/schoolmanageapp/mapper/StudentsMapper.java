package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentsMapper {
    Students toEntity(StudentsDto studentsDto);

    StudentsDto toDto(Students students);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Students partialUpdate(StudentsDto studentsDto, @MappingTarget Students students);

    List<StudentsDto> toDto(List<Students> students);
}