package az.company.schoolmanageapp.mapper;

import az.company.schoolmanageapp.entity.Complaint;
import az.company.schoolmanageapp.model.dto.ComplaintDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ComplaintMapper {
    Complaint toEntity(ComplaintDto complaintDto);

    ComplaintDto toDto(Complaint complaint);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Complaint partialUpdate(ComplaintDto complaintDto, @MappingTarget Complaint complaint);

    List<ComplaintDto> toDto(List<Complaint> complaints);
}