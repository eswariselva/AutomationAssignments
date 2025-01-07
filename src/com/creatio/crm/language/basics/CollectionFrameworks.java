package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFrameworks {
	
	/**Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data. 
	  *Now, Create List<String,Map<String,String>> to store all the data and Print the data from Product details > Supplier Name > Office Depot
      *from the Map<String, Map<String,String>> 
      */
	
	// This program is to demonstrate the usage of collection frameworks

	public static void main(String[] args) {
		
	// This code is for student details.
		
	/* This student details contains two different datatypes like int,string values but here we are using int as string values 
	 * So we go for MAP collection type.
	 */	
		
		
		/*For each row one map is created then later all rows are grouped under arraylist and then retrieved data using .get() method where 
		 * product is stored and then accessed row no using get(index) method then accessed particular data using key i.e supplier
		 */
		// Storing the studentdetails of John Doe
		Map<String,String> studentdetails1 = new HashMap<String,String>();
	    studentdetails1.put("Name","John Doe");
		studentdetails1.put("Age","20");
		studentdetails1.put("Gender","Male");
		studentdetails1.put("RollNo","S12345");
		studentdetails1.put("Grade","A");
		studentdetails1.put("Major", "Computer Science");
		studentdetails1.put("GPA", "3.8");
		studentdetails1.put("Email", "john@example.com");
		studentdetails1.put("Contact Number","9999997777");
		studentdetails1.put("Address", "123 Elm St");
		System.out.println(studentdetails1);
	
		// Storing the studentdetails of Jane Smith
		Map<String,String> studentdetails2 = new HashMap<String,String>();
		studentdetails2.put("Name", "Jane Smith");
		studentdetails2.put("Age", "21");
		studentdetails2.put("Gender", "Female");
		studentdetails2.put("RollNo", "S12346");
		studentdetails2.put("Grade", "B");
		studentdetails2.put("Major", "Mathematics");
		studentdetails2.put("GPA", "3.5");
		studentdetails2.put("Email", "jane@example.com");
		studentdetails2.put("Contact Number", "9876665666");
		studentdetails2.put("Address", "456 Oak St");
		System.out.println(studentdetails2);
		
		// Storing the studentdetails of Mike Brown
		Map<String,String> studentdetails3 = new HashMap<String,String>();
		studentdetails3.put("Name", "Mike Brown");
		studentdetails3.put("Age", "22");
		studentdetails3.put("Gender", "Male");
		studentdetails3.put("RollNo", "S12347");
		studentdetails3.put("Grade", "A");
		studentdetails3.put("Major", "Physics");
		studentdetails3.put("GPA", "3.9");
		studentdetails3.put("Email", "mike@example.com");
		studentdetails3.put("Contact Number", "8787876546");
		studentdetails3.put("Address", "789 Pine St");
		System.out.println(studentdetails3);
		
		//This is the code for employee details of Alice Green
		Map<String,String> employeedetails1 = new HashMap<String,String>();
		employeedetails1.put("EmployeeID", "E001");
		employeedetails1.put("Name", "Alice Green");
		employeedetails1.put("Age","30");
		employeedetails1.put("Gender", "Female");
		employeedetails1.put("Department","Engineering");
		employeedetails1.put("Position","Software Engineer");
		employeedetails1.put("Salary","75000");
		employeedetails1.put("Email", "alice@example.com");
		employeedetails1.put("Contact Number", "9876543213");
		System.out.println(employeedetails1);
		
		//This is the code for employee details of Bob Johnson
		Map<String, String> employeedetails2 = new HashMap<String, String>();
		employeedetails2.put("EmployeeID", "E002");
		employeedetails2.put("Name", "Bob Johnson");
		employeedetails2.put("Age", "35");
		employeedetails2.put("Gender", "Male");
		employeedetails2.put("Department", "Marketing");
		employeedetails2.put("Position", "Marketing Manager");
		employeedetails2.put("Salary", "85000");
		employeedetails2.put("Email", "bob@example.com");
		employeedetails2.put("Contact Number", "9876543214");
		System.out.println(employeedetails2);
		
		//This is the code for employee details of Carol White
		Map<String, String> employeedetails3 = new HashMap<String, String>();
		employeedetails3.put("EmployeeID", "E003");
		employeedetails3.put("Name", "Carol White");
		employeedetails3.put("Age", "28");
		employeedetails3.put("Gender", "Female");
		employeedetails3.put("Department", "Sales");
		employeedetails3.put("Position", "Sales Executive");
		employeedetails3.put("Salary", "65000");
		employeedetails3.put("Email", "carol@example.com");
		employeedetails3.put("Contact Number", "9876543215");
		System.out.println(employeedetails3);
		
		
		//This code is to store product details of Laptop
		Map<String,String> productdetails1=new HashMap<String,String>();
		productdetails1.put("Product ID","P001");
		productdetails1.put("Name","Laptop");
		productdetails1.put("Category","Electronics");
		productdetails1.put("Price","$1200");
		productdetails1.put("Stock Quantity","50");
		productdetails1.put("Supplier","Tech Supplies");
		productdetails1.put("Warranty","2 years");
		productdetails1.put("Rating","4.5");
		productdetails1.put("ManufacturingDate","15-01-2023");
		productdetails1.put("Expiry Date","15-01-2025");
		System.out.println(productdetails1);
		
		//This code is to store product details of DeskChair
		Map<String,String> productdetails2=new HashMap<String,String>();
		productdetails2.put("Product ID","P002");
		productdetails2.put("Name","Desk Chair");
		productdetails2.put("Category","Furnitures");
		productdetails2.put("Price","$150");
		productdetails2.put("Stock Quantity","200");
		productdetails2.put("Supplier","Office Depot");
		productdetails2.put("Warranty","1 year");
		productdetails2.put("Rating","4");
		productdetails2.put("ManufacturingDate","10-02-2023");
		productdetails2.put("Expiry Date","N/A");
		System.out.println(productdetails2);
		
		//This code is to store product details of CoffeeMaker
		Map<String,String> productdetails3=new HashMap<String,String>();
		productdetails3.put("Product ID","P003");
		productdetails3.put("Name","Coffee Maker");
		productdetails3.put("Category","Kitchen");
		productdetails3.put("Price","$75");
		productdetails3.put("Stock Quantity","100");
		productdetails3.put("Supplier","Kitchen World");
		productdetails3.put("Warranty","6 Months");
		productdetails3.put("Rating","4.2");
		productdetails3.put("ManufacturingDate","20-03-2023");
		productdetails3.put("Expiry Date","20-03-2024");
		System.out.println(productdetails3);
		
		
		//This is the code to store all student details together under arraylist
		List<Map<String,String>> studentlist =new ArrayList<Map<String,String>>();
		studentlist.add(studentdetails1);
		studentlist.add(studentdetails2);
		studentlist.add(studentdetails3);
		System.out.println(studentlist);
		
		//This is the code to store all employee details together under arraylist
		List<Map<String,String>> employeelist =new ArrayList<Map<String,String>>();
		employeelist.add(employeedetails1);
		employeelist.add(employeedetails2);
		employeelist.add(employeedetails3);
		System.out.println(employeelist);
		
		//This is the code to store all employee details together under arraylist
		List<Map<String, String>> productlist = new ArrayList<Map<String, String>>();
		productlist.add(productdetails1);
		productlist.add(productdetails2);
		productlist.add(productdetails3);
		System.out.println(productlist);
		
		
		
		//This code is to retrieve paarticular data using Map
		Map<String,List<Map<String, String>>> data = new HashMap<String,List<Map<String, String>>> ();
		data.put("Student",studentlist);
		data.put("Employee", employeelist);
		data.put("Product", productlist);
		
		System.out.println(data);
		System.out.println("Print the product details > Supplier Name:"+ data.get("Product").get(1).get("Supplier"));
		
		}

}
