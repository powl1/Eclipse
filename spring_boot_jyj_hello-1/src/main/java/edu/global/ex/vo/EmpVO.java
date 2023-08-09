package edu.global.ex.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class EmpVO {
	
	private int empno; // NOT NULL NUMBER(4)
	private String ename; // VARCHAR2(10)
	private String job;// VARCHAR2(9)
	private int mgr;// NUMBER(4)
	private Timestamp hiredate;// DATE
	private int sal;// NUMBER(7,2)
	private int comm;// NUMBER(7,2)
	private int deptno;// NUMBER(2)
	
}