package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Specialization;
import az.company.schoolmanageapp.model.dto.SpecializationDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SpecializationMapper {
    Specialization toEntity(SpecializationDto specializationDto);

    SpecializationDto toDto(Specialization specialization);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Specialization partialUpdate(SpecializationDto specializationDto, @MappingTarget Specialization specialization);

    List<SpecializationDto> toDto(List<Specialization> specializations);
}