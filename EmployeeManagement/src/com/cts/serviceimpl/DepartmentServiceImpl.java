package com.cts.serviceimpl;
import java.util.ArrayList;
import java.util.List;
import com.cts.bean.Department;
import com.cts.bean.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeService;

public class DepartmentServiceImpl implements DepartmentService {
	private List<Department> deptList;
	EmployeService empservice;

	public DepartmentServiceImpl() {

		deptList = new ArrayList<Department>();
		empservice = new EmployeeServiceImpl();
	}

	public DepartmentServiceImpl(EmployeService empservice) {
		deptList = new ArrayList<Department>();
		this.empservice = empservice;
	}

	@Override
	public boolean add(Department dept) {
		if (get(dept.getId()) != null) {
			return false;
		}

		deptList.add(dept);
		return true;
	}

	@Override
	public boolean update(Department dept) {
		if (get(dept.getId()) == null) {

			return false;
		}

		deptList.remove(get(dept.getId()));

		// Department temp=get(dept.getId());
		// deptList.remove(temp);y
		deptList.add(dept);
		return true;
	}

	@Override
	public boolean delete(int id) {
		Department dept = get(id);
		if (dept == null) {
			return false;
		}

		deptList.remove(dept);
		return true;
	}

	@Override
	public Department get(int id) {
		for (Department dept : deptList) {
			if (dept.getId() == id)
				return dept;

		}
		return null;
	}

	@Override
	public List<Department> get() {
		return deptList;
	}

	@Override
	public boolean addEmployetoDepartment(int empId, int deptId) {
		Employee emp = empservice.get(empId);
		Department dept = get(deptId);
		List<Employee> empList = getEmployesinParticularDepartment(deptId);
		if (isExist(deptId, empId))
			return false;
		deptList.remove(dept);
		if (emp == null || dept == null)
			return false;
		
		if (empList == null) {
			empList = new ArrayList<Employee>();
		}
				
		
		
		empList.add(emp);
		dept.setEmplist(empList);
		deptList.add(dept);
		return true;

	}

	public boolean isExist(int deptId, int empId) {
		List<Employee> empList = getEmployesinParticularDepartment(deptId);
		if (empList == null)
			return false;
		for (Employee emp : empList) {
			if (emp.getId() == empId)
				return true;
		}
		return false;

	}

	@Override
	public boolean remove(int empId, int deptId) {
		List<Employee> empList = getEmployesinParticularDepartment(deptId);
		if (!isExist(deptId, empId))
			return false;
		Employee emp = empservice.get(empId);
		Department dept = get(deptId);
		if (emp == null || dept == null)
			return false;
		
		
		empList.remove(emp);

		return true;
	}

	@Override
	public List<Employee> getEmployesinParticularDepartment(int deptId) {
		List<Department> deptList = get();
		for (Department dept : deptList) {
			if (deptId == dept.getId()) {
				return dept.getEmplist();
			}
		}
		return null;
		// return get(deptId).getEmplist(); //Single Line is Enough to get Employees in
		// particular Department
	}

	public void display(Department dept) {
		System.out.println(dept.getId());
		System.out.println(dept.getName());
	}

	@Override
	public void display(List<Department> deptList) {
		for (Department dept : deptList) {
			display(dept);
		}

	}

	@Override
	public List<Employee> getEmployees(int deptId, int amount) {
		List<Employee> empList=getEmployesinParticularDepartment(deptId);
		List<Employee> salaryList=new ArrayList();
		if(empList!=null) {
		for(Employee employee:empList) {
			if((employee.getSalary()>=amount))
				salaryList.add(employee);
		}
		return salaryList;
		}
		return null;
	}

	@Override
	public List<Employee> getEmployees(int deptId, int min, int max) {
		List<Employee> salaryList=new ArrayList();
		List<Employee> empList=getEmployesinParticularDepartment(deptId);
		for(Employee employee:empList) {
			if((employee.getSalary()>min)&&(employee.getSalary()<max))
				salaryList.add(employee);
		}
		return salaryList;
	}
}
	