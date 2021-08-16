package AgeConcept;

public class Employee implements Comparable<Employee> {
	int empage;
	String empname;

	Employee(int empage,String empname)
	{
		this.empage=empage;
		this.empname=empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public int compareTo(Employee o) {
		if(o.empage<o.empage)
		{
			return -1;
		}
		else if(o.empage>o.empage)
		{
			return 0;
		}
		else
		{
			return 0;
		}

System.out.println("Innsta Code");
		
	}
}
