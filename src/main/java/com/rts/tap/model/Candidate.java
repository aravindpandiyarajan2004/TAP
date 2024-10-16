package com.rts.tap.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	private String candidateGender;

	@OneToOne
	private CandidateAddress candidateAddress;

	@OneToOne
	private CandidateQualification candidateQualification;

	@OneToOne
	private CandidateDetails candidateDetails;

	@OneToMany(targetEntity = CandidateEducation.class, cascade = CascadeType.ALL)
	@JoinColumn()
	private List<CandidateEducation> candidateEducation;

	@OneToOne
	private CandidateAdditionals candidateAdditionals;
	
	@OneToMany(targetEntity = CandidateJobAppliedStatus.class, cascade = CascadeType.ALL)
	@JoinColumn()
	private List<CandidateJobAppliedStatus> candidateJobAppliedStatus;
	
	@OneToOne
	private CandidateAssessment candidateAssessment;
	
	@OneToOne
	private CandidateInterview candidateInterview;
	

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] candidateResume;

}
