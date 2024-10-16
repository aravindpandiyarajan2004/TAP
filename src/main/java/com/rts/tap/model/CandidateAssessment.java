package com.rts.tap.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidateAssessment_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateAssessment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateAssessmentId;
	
	
	@Column
	private int jobId; //it will be get it from account manager module
	
	@Column
	private Date assessmentScheduledDate;
	
	@Column
	private int assessmentId; // this assessment id will be get it from Hiring executive module 
	
	@Column
	private int candidateAssessmentDuration;
	
	@Column
	private String candidateAssessmentStatus;

}
