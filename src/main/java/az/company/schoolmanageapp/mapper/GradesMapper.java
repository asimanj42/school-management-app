package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Grades;
import az.company.schoolmanageapp.model.dto.GradesDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GradesMapper {
    Grades toEntity(GradesDto gradesDto);

    GradesDto toDto(Grades grades);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Grades partialUpdate(GradesDto gradesDto, @MappingTarget Grades grades);

    List<GradesDto> toDto(List<Grades> grades);
}