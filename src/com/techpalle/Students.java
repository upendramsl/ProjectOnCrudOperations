package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class Students
{
	private static final String url="jdbc:mysql://localhost:3306/palle";
	
	private static Connection con=null;
	private static Statement s=null;
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	
	
	public void Creating()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","upendra");
			s=con.createStatement();
			s.executeUpdate("create table student(sno int primary key auto_increment,sname varchar(60),subject varchar(60),email varchar(70))");
			
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(s!=null)
				{
				s.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public void inserting(String name,String sub,String email)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","upendra");
			ps=con.prepareStatement("insert into student(sname,subject,email) values(?,?,?)");
			
			ps.setString(1,name);
			ps.setString(2, sub);
			ps.setString(3, email);
			
			ps.executeUpdate();
			
			
			
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ps!=null)
				{
				ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	

}
	public void updating(int no,String email,String sub)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","upendra");
			ps=con.prepareStatement("update student set email=?,subject=? where sno=?");
			
			
			ps.setString(1,email);
			ps.setString(2, sub);
			ps.setInt(3,no);
			
			ps.executeUpdate();
			
			
			
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ps!=null)
				{
				ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}
	public void delete(int no)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","upendra");
			ps=con.prepareStatement("delete from student where sno=?");
			
			ps.setInt(1, no);
			
			ps.executeUpdate();
			
			
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ps!=null)
				{
				ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}
	public void read()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","upendra");
			s=con.createStatement();
			rs=s.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("sno"));
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("subject"));
				System.out.println(rs.getString("email"));
			}
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(s!=null)
				{
				s.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	public ArrayList<Department> reading()
	{
		ArrayList<Department> al=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","upendra");
			s=con.createStatement();
			rs=s.executeQuery("select * from student");
			while(rs.next())
			{
			int i=rs.getInt(1);
			String n=rs.getString(2);
			String s=rs.getString(3);
			String e=rs.getString(4);
			
			Department d=new Department(i, n, s, e);
			
			al.add(d);
			
		}}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(s!=null)
				{
				s.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return al;

}
	
}

