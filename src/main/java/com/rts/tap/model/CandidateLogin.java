package com.rts.tap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidateLogin_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateLoginId;
	
	@Column(unique = true)
	private String candidateEmail;
	
	@Column
	private String candidatePassword;
	
	@OneToOne
	private Candidate candidate;
	
	

}
