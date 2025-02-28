package com.gulaev.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="subjects")
@AllArgsConstructor
public class Subject implements Model {

    @Id
    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "subjects_description")
    private String subjectDescription;

    @Column(name = "speciality_id")
    private Integer specialityId;

    @Column(name = "subject_teacher_id")
    private Integer subjectTeacherId;

//    @ManyToOne
//    @JoinColumn(name = "speciality_id", referencedColumnName = "speciality_id")
//    private Speciality speciality;
//

    public Subject() {
    }
}
