package dao;

import java.sql.*;

import pojos.Student;
import utils.DBUtils;

public class ValidateDao implements IValidateDao
{
	private Connection cn;
	private PreparedStatement pst;
	
	
	public ValidateDao() throws Exception 
	{
         cn= DBUtils.fetchConnection();
         pst = cn.prepareStatement("Select * from Student where Name= ? and Password = ?");
     }
	
	public void cleanUp() throws Exception
	{
		if(pst!=null)
			pst.close();
		if(cn!=null)
			cn.close();
	}

	@Override
	public Student validateStudent(String Name, String Password) throws Exception
	{
       pst.setString(1, Name);
       pst.setString(2, Password);
       
       try(ResultSet rst = pst.executeQuery())
       {
		if(rst.next())
		 return new Student(rst.getString(1),rst.getString(2));
	   
	   }
		return null;
	}
 
	
}
