package com.ustglobal.jpawithhibernateapp.dto;

import javax.persistence.*;

@Entity
@Table(name="product")
public class ProductInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private int quantity;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return pname;
	}
	public void setName(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
