package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Specialization;
import az.company.schoolmanageapp.exception.SpecializationNotFoundException;
import az.company.schoolmanageapp.mapper.SpecializationMapper;
import az.company.schoolmanageapp.model.dto.SpecializationDto;
import az.company.schoolmanageapp.repository.SpecializationRepository;
import az.company.schoolmanageapp.service.inter.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    private final SpecializationRepository specializationRepository;
    private final SpecializationMapper specializationMapper;

    @Autowired
    public SpecializationServiceImpl(SpecializationRepository specializationRepository, SpecializationMapper specializationMapper) {
        this.specializationRepository = specializationRepository;
        this.specializationMapper = specializationMapper;
    }

    @Override
    public List<Object[]> getSpecializations() {
        return specializationRepository.getSpecializationByLessonsList();
    }

    @Override
    public List<SpecializationDto> getAllSpecialization() {
        List<Specialization> specializations = specializationRepository.findAll();
        List<SpecializationDto> result = specializationMapper.toDto(specializations);
        return result;
    }

    @Override
    public SpecializationDto findById(Integer id) {
        Specialization specialization = getSpecializationById(id);
        return specializationMapper.toDto(specialization);
    }

    @Override
    public Specialization getSpecializationById(Integer id) {
        Optional<Specialization> specialization = specializationRepository.findById(id);
        if (specialization.isPresent()) {
            return (specialization.get());
        }
        throw new SpecializationNotFoundException("Specialization not found by id" + id);

    }
    @Override
    public void addSpecialization(SpecializationDto specialization) {
        specializationRepository.save(specializationMapper.toEntity(specialization));
    }

    @Override
    public void updateSpecialization(SpecializationDto specialization) {
        specializationRepository.save(specializationMapper.toEntity(specialization));
    }

    @Override
    public void removeSpecialization(Integer specializationId) {
        Specialization specialization = getSpecializationById(specializationId);
        specializationRepository.delete(specialization);
    }
}
