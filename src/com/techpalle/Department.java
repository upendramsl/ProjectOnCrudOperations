package com.techpalle;

public class Department 
{
	private int id;
	private String name;
	private String subject;
	private String email;

	public Department(int i, String n, String l, String e)
	{
	
		this.id = i;
		this.name = n;
		this.subject = l;
		this.email = e;
	
	}
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String Subject) 
	{
		this.subject = Subject;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}


}
