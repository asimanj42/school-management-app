package az.company.schoolmanageapp.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "specialization")
public class Specialization implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "speciality_name")
    private String specialityName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specialityId")
    private List<Students> studentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specialitizationId")
    private List<Lessons> lessonsList;

    public Specialization() {
    }

    public Specialization(Integer id) {
        this.id = id;
    }

    public Specialization(Integer id, String specialityName) {
        this.id = id;
        this.specialityName = specialityName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Lessons> getLessonsList() {
        return lessonsList;
    }

    public void setLessonsList(List<Lessons> lessonsList) {
        this.lessonsList = lessonsList;
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
        if (!(object instanceof Specialization)) {
            return false;
        }
        Specialization other = (Specialization) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
//
//    @Override
//    public String toString() {
//        return "Specialization[ id=" + id + " ]";
//    }

}
