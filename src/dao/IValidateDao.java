package dao;

import pojos.Student;

public interface IValidateDao 
{
   Student validateStudent(String Name,String Password) throws Exception;
}
