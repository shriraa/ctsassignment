package sampleArrayList;

public class Employee 
{
	
		private int id;
		private String name;
		public double salary;
		
		//Constructors
		public Employee(int id, String name, double salary) 
		{
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public int getId() 
		{
			return id;
		}
		public void setId(int id) 
		{
			this.id = id;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public double getSalary() 
		{
			return salary;
		}
		public void setSalary(double salary) 
		{
			this.salary = salary;
		}

		public void displayEmpProp()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
		}

		public boolean equals(Object obj)		{
			if(this ==obj)
				return true;
			if(obj == null)
				return false;
			if(getClass() != obj.getClass())
				return false;
			Employee others = (Employee) obj;
			if(name == null)
			{
				if(others.name != null)
				{
					return false;
				}
			}
			else if(!name.equals(others.name))
				return false;
			if(salary != others.salary)
				return false;
			
			return true;
		}
}