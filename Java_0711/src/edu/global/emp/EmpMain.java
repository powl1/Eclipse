package edu.global.emp;

import java.util.List;

import edu.global.emp.dao.EmpDao;
import edu.global.emp.dto.EmpDto;

public class EmpMain {
   
   public static void main(String[] args) {
      EmpDao dao = new EmpDao();
      
      List<EmpDto> emps = dao.getEmps();
      
      for (EmpDto emp : emps) {
         System.out.println("사원번호" + emp.getEmpno());
         System.out.println("사원이름" + emp.getEname());
         System.out.println("날짜" + emp.getHiredate());
      }
   }
   
}