package com.creatio.crm.language.basics;

public class EmpGroups {

	public static void main(String[] args) {
		
		Employees emp = new Employees();
		
		//String array to store employeesNames
		String [] empNames = new String [3];
		
		empNames [0] = emp.name1;
		empNames [1] = emp.name2;
		empNames [2] = emp.name3;
		
		//int array to store employeesIds
		int [] empIDs = new int [3];
		
		empIDs [0] = emp.empId1;
		empIDs [1] = emp.empId2;
		empIDs [2] = emp.empId3;
		
		System.out.println("Employee Name:"+emp.name1+",Employee ID:"+emp.empId1);
		System.out.println("Employee Name:"+emp.name2+",Employee ID:"+emp.empId2);
		System.out.println("Employee Name:"+emp.name3+",Employee ID:"+emp.empId3);
				
		}

}
