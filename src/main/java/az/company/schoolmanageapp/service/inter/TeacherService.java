package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Object[]> getTeachers();

    void addTeacher(Teacher teacher);
}
