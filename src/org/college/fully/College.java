package org.college.fully;

public class College implements CollegeSub1,CollegeStaff {

	@Override
	public void name() {
		System.out.println("CIET");
		
	}
	
	@Override
	public void id() {
		System.out.println("2704");
		
	}
	
	@Override
	public void staffName() {
		System.out.println("XYZ");
		
	}
	
	@Override
	public void staffId() {
		System.out.println("1234");
		
	}
	
public static void main(String[] args) {
	College c=new College();
	c.name();
	c.id();
	c.staffName();
	c.staffId();
}
}
