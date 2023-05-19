package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.dto.ComplaintDto;
import az.company.schoolmanageapp.entity.Complaint;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ComplaintMapper {
    Complaint toEntity(ComplaintDto complaintDto);

    ComplaintDto toDto(Complaint complaint);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Complaint partialUpdate(ComplaintDto complaintDto, @MappingTarget Complaint complaint);
}