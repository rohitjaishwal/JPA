package com.dev.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dev.onetoone.beans.EmpInfoBean;

import lombok.Data;

@Entity
@Table(name = "emp_exp")
@Data
public class EmpExperience {
	@Id
	@Column
	private int expid;
	@Column
	private String company;
	@Column
	private String period;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmpInfoBean eib;
}
