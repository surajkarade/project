package com.webcorestone.DMS.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.DMS.daoI.StudentDaoI;
import com.webcorestone.DMS.model.StudentDetails;
import com.webcorestone.DMS.serviceI.MedicalStudentServiceI;

@Service
public class MedicalStudentServiceImpl implements MedicalStudentServiceI  {
	
	@Autowired
	 private StudentDaoI stuI;
	
	public String saveData(StudentDetails s)
	{
		
		stuI.save(s);
		return null;
	}
	
	public StudentDetails LoginCheck(String email,Date dob)
	{
		StudentDetails s=(StudentDetails) stuI.findAllByEmailAndDob(email, dob);
		return s;
		
	}
	
	public void deleteData(Integer id)
	{
		stuI.deleteById(id);
	}
	
	

}
