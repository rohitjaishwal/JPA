package com.dev.onetoone.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp_info")
@Data
public class EmpInfoBean {
	@Id
	@Column
	private int id;
	@Column
	private String name;
}
