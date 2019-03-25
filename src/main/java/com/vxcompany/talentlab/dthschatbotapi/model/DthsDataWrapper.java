package com.vxcompany.talentlab.dthschatbotapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class DthsDataWrapper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="data_id")
    private Long id;

    // Report
    @Column(name="ReportID")
    private Integer reportId;
    @Column(name="ReportDescription")
    private String reportDescription;
    @Column(name="ReportOriginId")
    private Integer reportOriginId;
    @Column(name="PlannedPathologistId")
    private Integer plannedPathologistId;
    @Column(name="Report_User")
    private String reportUser;
    @Column(name="report_TimeStamp")
    private LocalDateTime ReportTimeStamp;

    // Container
    @Column(name="ContainerID")
    private Integer containerID;
    @Column(name="ReceiveId")
    private Integer receiveId;
    @Column(name="Priority")
    private String priority;
    @Column(name="SpeciminID")
    private Integer speciminID;
    @Column(name="SpeciminCode")
    private String speciminCode;

    // Cassette
    @Column(name="CassetteID")
    private Integer cassetteID;
    @Column(name="CutID")
    private Integer cutID;
    @Column(name="Description")
    private String description;
    @Column(name="Cassettecolor")
    private String cassetteColor;
    @Column(name="Casette_ProcessStep")
    private String casetteProcessStep;

    // Slide
    @Column(name="SlideID")
    private Integer slideID;
    @Column(name="SlideDescription")
    private String slideDescription;
    @Column(name="Slide_User")
    private String slideUser;
    @Column(name="Slide_ProcessStep")
    private String slideProcessStep;
    @Column(name="Slide_TimeStamp")
    private LocalDateTime slideTimeStamp;
    @Column(name="RequestID")
    private Integer requestID;
    @Column(name="TechniqueId")
    private Integer techniqueId;
}
