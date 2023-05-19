package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.LessonDto;
import az.company.schoolmanageapp.entity.Lessons;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LessonsMapper {
    Lessons toEntity(LessonDto lessonDto);

    LessonDto toDto(Lessons lessons);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Lessons partialUpdate(LessonDto lessonDto, @MappingTarget Lessons lessons);
}