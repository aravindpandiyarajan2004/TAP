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
@Table(name = "candidateInterview_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateInterview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateInterviewId;
	
	@Column
	private int jobId; //it will be get it from account manager module
	
	@Column
	private Date interviewScheduledDate;
	
	@Column
	private int interviewId; // this interview id will be get it from Hiring executive module [interviewer]
	
	@Column
	private int candidateInterviewDuration;
	
	@Column
	private String candidateInterviewStatus;

}

