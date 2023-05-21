package az.company.schoolmanageapp.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "lessons")

public class Lessons {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lessonId")
    private List<Schedule> scheduleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lessonId")
    private List<Teacher> teacherList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lessonId")
    private List<Grades> gradesList;
    @JoinColumn(name = "specialitization_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Specialization specialitizationId;

    public Lessons() {
    }

    public Lessons(Integer id) {
        this.id = id;
    }

    public Lessons(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    public Specialization getSpecialitizationId() {
        return specialitizationId;
    }

    public void setSpecialitizationId(Specialization specialitizationId) {
        this.specialitizationId = specialitizationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lessons)) {
            return false;
        }
        Lessons other = (Lessons) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
