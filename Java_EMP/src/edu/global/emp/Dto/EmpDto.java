package edu.global.emp.Dto;

import java.sql.Timestamp;

//이름       널?       유형           
//-------- -------- ------------ 
//EMPNO    NOT NULL NUMBER(4)    
//ENAME             VARCHAR2(10) 
//JOB               VARCHAR2(9)  
//MGR               NUMBER(4)    
//HIREDATE          DATE         
//SAL               NUMBER(7,2)  
//COMM              NUMBER(7,2)  
//DEPTNO            NUMBER(2)

public class EmpDto {

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private TimeSet hiredate;
	
	public EmpDto(int empno, String ename, String job, int mgr, TimeSet hiredate) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public TimeSet getHiredate() {
		return hiredate;
	}

	public void setHiredate(TimeSet hiredate) {
		this.hiredate = hiredate;
	}



}
