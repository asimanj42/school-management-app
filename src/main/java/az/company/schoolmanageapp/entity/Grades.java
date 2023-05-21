package az.company.schoolmanageapp.entity;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "grades")
public class Grades{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "activity")
    private Integer activity;
    @Column(name = "quiz")
    private Integer quiz;
    @Column(name = "participation")
    private Integer participation;
    @Column(name = "midterm")
    private Integer midterm;
    @Column(name = "final")
    private Integer final1;
    @Column(name = "avarage")
    private Integer avarage;
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Lessons lessonId;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Students studentId;

    public Grades() {
    }

    public Grades(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getQuiz() {
        return quiz;
    }

    public void setQuiz(Integer quiz) {
        this.quiz = quiz;
    }

    public Integer getParticipation() {
        return participation;
    }

    public void setParticipation(Integer participation) {
        this.participation = participation;
    }

    public Integer getMidterm() {
        return midterm;
    }

    public void setMidterm(Integer midterm) {
        this.midterm = midterm;
    }

    public Integer getFinal1() {
        return final1;
    }

    public void setFinal1(Integer final1) {
        this.final1 = final1;
    }

    public Integer getAvarage() {
        return avarage;
    }

    public void setAvarage(Integer avarage) {
        this.avarage = avarage;
    }

    public Lessons getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lessons lessonId) {
        this.lessonId = lessonId;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
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
        if (!(object instanceof Grades)) {
            return false;
        }
        Grades other = (Grades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
//
//    @Override
//    public String toString() {
//        return "Grades[ id=" + id + " ]";
//    }

}
