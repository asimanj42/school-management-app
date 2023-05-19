package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.ScheduleDto;
import az.company.schoolmanageapp.entity.Schedule;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ScheduleMapper {
    Schedule toEntity(ScheduleDto scheduleDto);

    ScheduleDto toDto(Schedule schedule);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Schedule partialUpdate(ScheduleDto scheduleDto, @MappingTarget Schedule schedule);
}