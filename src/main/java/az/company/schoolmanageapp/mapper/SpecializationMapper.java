package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.SpecializationDto;
import az.company.schoolmanageapp.entity.Specialization;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SpecializationMapper {
    Specialization toEntity(SpecializationDto specializationDto);

    @AfterMapping
    default void linkStudentsList(@MappingTarget Specialization specialization) {
        specialization.getStudentsList().forEach(studentsList -> studentsList.setSpecialityId(specialization));
    }

    @AfterMapping
    default void linkLessonsList(@MappingTarget Specialization specialization) {
        specialization.getLessonsList().forEach(lessonsList -> lessonsList.setSpecialitizationId(specialization));
    }

    SpecializationDto toDto(Specialization specialization);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Specialization partialUpdate(SpecializationDto specializationDto, @MappingTarget Specialization specialization);
}