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
@Table(name = "candidateEducation_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateEducationId;

	@Column
	private String candidateEducationStage;

	@Column
	private String candidateInstitutionName;

	@Column
	private String candidateYearOfCompletion;
	
	


}
