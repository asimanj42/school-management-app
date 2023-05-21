package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.model.dto.LessonsDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LessonsMapper {
    Lessons toEntity(LessonsDto lessonsDto);

    @AfterMapping
    default void linkScheduleList(@MappingTarget Lessons lessons) {
        lessons.getScheduleList().forEach(scheduleList -> scheduleList.setLessonId(lessons));
    }

    LessonsDto toDto(Lessons lessons);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Lessons partialUpdate(LessonsDto lessonsDto, @MappingTarget Lessons lessons);

    List<LessonsDto> toDto(List<Lessons> lessons);
}