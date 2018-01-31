package com.spring.jan30.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jan30.dao.EmployeeDAO;
import com.spring.jan30.pojo.Employee;

public class SpringJdbcTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		//Employee e = new Employee(1,"Manoj","Kumar",4000);
		EmployeeDAO dao = ac.getBean("dao", EmployeeDAO.class);
		//dao.saveEmployee(e);
		/*Employee em = dao.getEmployee(1);
		System.out.println(em);
		em.setFirtsName("Manoj Kumar");
		em.setLastName("Nadipelli");
		dao.updateEmployee(em);*/
		//dao.deleteEmployee(1);
		for(Employee e : dao.getAllEmployees()){
			System.out.println(e);
		}
		

	}

}
