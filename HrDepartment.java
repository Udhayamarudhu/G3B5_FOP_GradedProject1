package com.greatlearning.assignment1.model;

public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		return "Hr Department";
		
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendence";
	}
	public String getWorDeadline() {
		return "Complete by EOD";
		
	}
	public String doActivity() {
		return "team lunch";
	}

}
