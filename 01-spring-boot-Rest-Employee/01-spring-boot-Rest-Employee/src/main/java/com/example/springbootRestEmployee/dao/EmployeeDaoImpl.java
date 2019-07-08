package com.example.springbootRestEmployee.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.springbootRestEmployee.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;
		
	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> query=currentSession.createQuery("from Employee",Employee.class);
		return query.list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		Employee employee= currentSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
