package com.rts.tap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "candidateAddress_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class CandidateAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateAddressId;

	@Column
	private String candidateDoorNumber;

	@Column
	private String candidateLocation;

	@Column
	private String candidateStreetName;

	@Column
	private String candidateCity;

	@Column
	private String candidateNativeDistrict;

	@Column
	private String candidateState;

	@Column
	private String candidateCountry;

	@Column
	private String candidatePincode;

}
