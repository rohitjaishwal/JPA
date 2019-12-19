package com.dev.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.dev.onetoone.beans.EmpInfoBean;

import lombok.Data;

@Entity
@Table(name = "training_info")
@Data
public class TrainingInfo {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "emp_training", joinColumns = @JoinColumn(name = "tid"),
	inverseJoinColumns = @JoinColumn(name = "id"))
	private List<EmpInfoBean> elist;	
}
