package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Specialization;
import az.company.schoolmanageapp.repository.SpecializationRepository;
import az.company.schoolmanageapp.service.inter.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    private SpecializationRepository specializationRepository;

    @Autowired
    public SpecializationServiceImpl(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }
    @Override
    public List<Object[]> getSpecializations() {
        return specializationRepository.getSpecializationByLessonsList();
    }

    @Override
    public void addSpecialization(Specialization specialization) {
        specializationRepository.save(specialization);
    }
}
