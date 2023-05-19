package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.TeacherDto;
import az.company.schoolmanageapp.entity.Teacher;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TeacherMapper {
    Teacher toEntity(TeacherDto teacherDto);

    TeacherDto toDto(Teacher teacher);

    @BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    Teacher partialUpdate(TeacherDto teacherDto, @MappingTarget Teacher teacher);
}