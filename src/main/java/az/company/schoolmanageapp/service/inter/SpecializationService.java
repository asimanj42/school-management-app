package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Specialization;

import java.util.List;

public interface SpecializationService {

    List<Object[]> getSpecializations();

    void addSpecialization(Specialization specialization);
}
