package com.greatlearning.assignment1.model;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment ad=new AdminDepartment() ;
		HrDepartment hr=new HrDepartment() ;
		TechDepartment tech=new TechDepartment() ;
		System.out.println("Welcome To  "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayHoliday());
		System.out.println();
		System.out.println("Welcome To  "+hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayHoliday());
		System.out.println();
		System.out.println("Welcome To  "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayHoliday());
		//System.out.println();
	}

}
