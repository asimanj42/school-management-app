package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Teacher;
import model.dto.TeacherDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TeacherMapper {
    Teacher toEntity(TeacherDto teacherDto);

    TeacherDto toDto(Teacher teacher);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Teacher partialUpdate(TeacherDto teacherDto, @MappingTarget Teacher teacher);

    List<TeacherDto> toDto(List<Teacher> teacher);
}