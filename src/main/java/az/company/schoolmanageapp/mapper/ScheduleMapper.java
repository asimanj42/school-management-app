package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Schedule;
import az.company.schoolmanageapp.model.dto.ScheduleDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ScheduleMapper {
    Schedule toEntity(ScheduleDto scheduleDto);

    ScheduleDto toDto(Schedule schedule);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Schedule partialUpdate(ScheduleDto scheduleDto, @MappingTarget Schedule schedule);

    List<ScheduleDto> toDto(List<Schedule> schedule);
}