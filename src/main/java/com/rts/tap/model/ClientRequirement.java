package com.rts.tap.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientRequirement_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientRequirement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientRequirementId;
	
	@ManyToOne(targetEntity = Login.class,cascade = CascadeType.ALL)
	@Column(name="clientId")
	private Login login;
	
	@Column
	private String jobTitle;
	
	@Column
	private String jobDescription;
	
	@Column
	private String requirements;
	
	@Column
	private String location;
	
	@Column
	private String employeeType;
	
	@Column
	private Date postingDate;
	
	@Column
	private Date expirationDate;
	
	@Column
	private String expectedCTC;
	
	@Column
	private int vacancy;
	
	

}
