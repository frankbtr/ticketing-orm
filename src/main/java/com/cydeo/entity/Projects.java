package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "projects")
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "is_deleted=false")
public class Projects extends BaseEntity{

    private String projectCode;
    private String projectName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private User assignedManager;
    @Column(columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(columnDefinition = "DATE")
    private LocalDate entDate;

    private String projectDetails;
    @Enumerated(EnumType.STRING)
    private Status projectStatus;


}
