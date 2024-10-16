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
@Table(name = "candidateDetails_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateDetailsId;
	
	@Column
	private String candidateYearsOfExperience;
	
	@Column
	private String candidateCurrentCTC;
	
	@Column
	private String candidateExpectedCTC;
	
	@Column
	private String candidateNoticePeriod;
	
	@Column
	private String candidateProgrammingLanguageProficiency;

}
