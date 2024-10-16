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
@Table(name = "candidateJobAppliedStatus_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateJobAppliedStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateJobAppliedStatusId;
	
	private int jobId; // it will be mapped from account manager module
	
	@Column
	private Date candidateApplicationDate;
	
	@Column
	private String candidateJobStatus;
	
	@Column
	private String jobNotes;
	
	@Column
	private String jobLastUpdatedTime;
	

}
