package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Teacher;
import az.company.schoolmanageapp.model.dto.TeacherDto;

import java.util.List;

public interface TeacherService {

    List<Object[]> getTeachers();

    List<TeacherDto> getAllTeacher();

    Teacher getTeacherById(Integer id);

    TeacherDto findById(Integer id);

    void addTeacher(TeacherDto teacher);

    void updateTeacher(TeacherDto teacher);

    void removeTeacher(Integer teacherId);

}
