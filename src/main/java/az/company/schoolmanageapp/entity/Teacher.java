package az.company.schoolmanageapp.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "teacher")
public class Teacher{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Lessons lessonId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacherId")
    private List<Complaint> complaintList;

    public Teacher() {
    }

    public Teacher(Integer id) {
        this.id = id;
    }

    public Teacher(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Lessons getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lessons lessonId) {
        this.lessonId = lessonId;
    }

    public List<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(List<Complaint> complaintList) {
        this.complaintList = complaintList;
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
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
//
//    @Override
//    public String toString() {
//        return "Teacher[ id=" + id + " ]";
//    }

}
