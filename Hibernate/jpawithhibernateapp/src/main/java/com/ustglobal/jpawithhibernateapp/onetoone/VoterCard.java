package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name="votercard")
@Data
public class VoterCard {

	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
	
}
