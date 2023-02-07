package com.techpalle;

import java.util.ArrayList;

public class MyProgramme {

	public static void main(String[] args)
	{
		Students s=new Students();
		
		//s.Creating();
		//s.inserting("ramesh","java","ramesh@gmail.com");
		//s.inserting("babu","python","babu@gmail.com");
		//s.updating(2, "java","babu2@gmail.com");
		//s.delete(2);
		//s.read();
	   ArrayList<Department> r=s.reading();
	   for(Department i:r)
	   {
		   System.out.println(i.getId());
		   System.out.println(i.getName());
		   System.out.println(i.getSubject());
		   System.out.println(i.getEmail());
		   System.out.println("<<<<<<<<<<<....>>>>>>>>>>>>>>>");
	   }

	}

}
