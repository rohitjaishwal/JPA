package com.dev.onetoone.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp_info2")
@Data
public class EmpInfoBean2 {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmpInfoBean eib;
		
}
