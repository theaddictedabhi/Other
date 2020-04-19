package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(1, "abhi",80000.0));
		empList.add(new Employee(2,"ankush",60000.0));
		empList.add(new Employee(3,"rashi", 30000.0));
		empList.add(new Employee(4,"shalini",20000.0));
		
		return empList;
	}
}
