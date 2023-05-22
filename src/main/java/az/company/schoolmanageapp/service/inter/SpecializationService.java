package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Specialization;
import az.company.schoolmanageapp.model.dto.SpecializationDto;
import az.company.schoolmanageapp.model.dto.TeacherDto;

import java.util.List;

public interface SpecializationService {

    List<Object[]> getSpecializations();

    List<SpecializationDto> getAllSpecialization();

    SpecializationDto findById(Integer id);

    void addSpecialization(SpecializationDto teacher);

    void updateSpecialization(SpecializationDto teacher);

    void removeSpecialization(Integer specializationId);
}
