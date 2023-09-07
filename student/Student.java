package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student Name : Shabana");
	}
	public void studentDept()
	{
		System.out.println("Student belongs to CSE department");
	}
	public void studentId()
	{
		System.out.println("Student id : SID001");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
		

	}

}
