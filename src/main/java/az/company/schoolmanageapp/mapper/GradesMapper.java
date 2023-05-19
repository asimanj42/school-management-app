package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.GradeDto;
import az.company.schoolmanageapp.entity.Grades;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GradesMapper {
    Grades toEntity(GradeDto gradeDto);

    GradeDto toDto(Grades grades);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Grades partialUpdate(GradeDto gradeDto, @MappingTarget Grades grades);
}