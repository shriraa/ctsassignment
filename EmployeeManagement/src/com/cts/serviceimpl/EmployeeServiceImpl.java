package com.cts.serviceimpl;
import java.util.ArrayList;
import java.util.List;
import com.cts.Exception.DuplicateUserException;
import com.cts.bean.Employee;
import com.cts.service.EmployeService;
public class EmployeeServiceImpl implements EmployeService {
	private List<Employee> empList;
    public EmployeeServiceImpl() {
		empList = new ArrayList<Employee>();
		
	}

	@Override
	public boolean save(Employee emp) throws DuplicateUserException {

		try {
			if (get(emp.getId()) != null) {
				throw new DuplicateUserException();
				//return false;
			}

			empList.add(emp);
		} catch (Exception e) {

			e.printStackTrace();

		}
		return true;

	}

	@Override
	public boolean update(Employee emp) {

		try {
			if (get(emp.getId()) == null) {

				return false;
			}

			empList.remove(get(emp.getId()));

			// Employee temp=get(emp.getId());
			// empList.remove(temp);y
			empList.add(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean delete(int id) {
		try {
			Employee emp = get(id);
			if (emp == null) {
				return false;
			}

			empList.remove(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public Employee get(int id) {

		try {
			for (Employee emp : empList) {
				if (emp.getId() == id)
					return emp;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Employee> get() {
		
		return empList;
	}
	@Override
	public void display(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}
	
	@Override
	public void display(List<Employee> empList) {
		for (Employee emp : empList) {
			display(emp);
		}

	}

	@Override
	public List<Employee> get(int min, int max) {
		//List<Employee> emp=get();
		List<Employee> salaryList=new ArrayList<Employee>();
		for(Employee employee:empList) {
			if((employee.getSalary()>min)&&(employee.getSalary()<max))
				salaryList.add(employee);
		}
		return salaryList;
	}

	@Override
	public List<Employee> getemployeeGreaterAmount(int amount) {
		List<Employee> salaryList=new ArrayList<Employee>();
		for(Employee employee:empList) {
			if((employee.getSalary()>=amount))
				salaryList.add(employee);
		}
		return salaryList;
	}

	

	
	

}
