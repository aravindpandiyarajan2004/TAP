package com.tap.candidate.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidate_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateId;

	@Column
	private String candidateName;

	@Column(unique = true)
	private String candidateEmail;

	@Column
	private String candidateMobile;

	@Column
	private String candidateDateOfBirth;

	@Column
	private String candidateString;

	@OneToOne
	private CandidateAddress candidateAddress;

	@OneToOne
	private CandidateQualification candidateQualification;

	@OneToOne
	private CandidateDetails candidateDetails;

	@OneToMany
	private List<CandidateEducation> candidateEducation;

	@OneToOne
	private CandidateAdditionals candidateAdditionals;

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] candidateResume;

}
