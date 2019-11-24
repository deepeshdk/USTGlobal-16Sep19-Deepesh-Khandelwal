package com.ustglobal.jpawithhibernateapp.onetomany;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name="pencilbox")
@Data
public class PencilBox {

	@Id
	@Column
	private int bid;
	@Column
	private String bname;
	
	@Exclude
	@OneToMany(mappedBy = "pencilBox")
	private List<Pencil> pencil;
	
}
