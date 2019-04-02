package com.vxcompany.talentlab.dthschatbotapi.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="data_id")
    private Long id;

    // Report
    @Column(name="report_id")
    private Integer reportId;
    @Column(name="report_description")
    private String reportDescription;
    @Column(name="report_origin_id")
    private Integer reportOriginId;
    @Column(name="report_planned_pathologist_id")
    private Integer plannedPathologistId;
    @Column(name="report_user")
    private String reportUser;
    @Column(name="report_timestamp")
    private LocalDateTime reportTimeStamp;

    // Container
    @Column(name="container_id")
    private Integer containerID;
    @Column(name="container_receive_id")
    private Integer receiveId;
    @Column(name="container_priority")
    private String priority;
    @Column(name="container_specimin_id")
    private Integer speciminID;
    @Column(name="container_specimin_code")
    private String speciminCode;

    // Cassette
    @Column(name="cassette_id")
    private Integer cassetteID;
    @Column(name="cassette_cut_id")
    private Integer cutID;
    @Column(name="cassette_description")
    private String description;
    @Column(name="cassette_color")
    private String cassetteColor;
    @Column(name="cassette_processstep")
    private String casetteProcessStep;

    // Slide
    @Column(name="slide_id")
    private Integer slideID;
    @Column(name="slide_description")
    private String slideDescription;
    @Column(name="slide_user")
    private String slideUser;
    @Column(name="slide_processstep")
    private String slideProcessStep;
    @Column(name="slide_timestamp")
    private LocalDateTime slideTimeStamp;
    @Column(name="slide_request_id")
    private Integer requestID;
    @Column(name="slide_technique_id")
    private Integer techniqueId;
}
