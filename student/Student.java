package org.student;

import org.department.Department;

public class Student extends Department {
	public static void studentName() {
		System.out.println("studentName:R");
		
	}
	public static void studentDept() {
		System.out.println("studentDept:MECH");
	
	}
	public static void studentId() {
		System.out.println("studentId:301");
    }
	public static void main(String[] args) {
		Student d = new Student();
		d.CollegeName();
		d.CollegeCode();
		d.CollegeRank();
		d.studentName();
		d.studentDept();
		d.studentId();
		
	}
}
