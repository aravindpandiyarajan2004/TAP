package com.rts.tap.model;

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
@Table(name = "candidateQualification_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateQualification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateQualificationId;
	
	@Column
	private String candidateCourse;
	
	@Column
	private String CandidateYearOfGraduation;

}
