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
@Table(name = "candidateAdditionals_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateAdditionals {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateAdditionalsId;

	@Column
	private String candidateLanguagesKnown;

	@Column
	private String candidateNationality;

	@Column
	private String candidateSkills;

}
