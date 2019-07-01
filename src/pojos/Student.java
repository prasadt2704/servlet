package pojos;

public class Student 
{
	private String Name;
	private String Password;
	
	
	public Student() 
	{
		super();
	}


	public Student(String name, String password) {
		super();
		Name = name;
		Password = password;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Password=" + Password + "]";
	}
	
	

}
