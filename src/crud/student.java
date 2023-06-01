package crud;

import java.util.Scanner;
//import crud1.student1;
import java.sql.*;

public class student {
	
	public static void main(String args[]) {
		System.out.println("Welcome to Student Management App");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Update Student");
			System.out.println("Press 5 to Exit app");
			
			int c = sc.nextInt();
			
			if(c==1) {
				//add student
				System.out.println("Enter your id");
				int id = sc.nextInt();
				
				System.out.println("Enter your name");
				String name = sc.next();
				
				System.out.println("Enter your email");
				String email = sc.next();
				
				System.out.println("Enter your standard");
				int std = sc.nextInt();
				
				System.out.println("Enter your division");
				String division = sc.next();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
					//Statement stm = con.createStatement();
					PreparedStatement stm = con.prepareStatement("insert into student values(?,?,?,?,?)");
					stm.setInt(1,id);
					stm.setString(2, name);
					stm.setString(3,email);
					stm.setInt(4, std);
					stm.setString(5, division);
					
					stm.executeUpdate();
					System.out.println("successfully add!");
					System.out.println(" ");
					
				} catch(Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				//create object for to store student
				
				//student1 st = new student1(id, name,email,std,division);
				//System.out.println(st);
			}else if(c==2) {
				System.out.println("Enter your id");
				int id = sc.nextInt();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
					PreparedStatement stm = con.prepareStatement("delete from student where sid=? ");
					
					stm.setInt(1,id);
					stm.execute();
					System.out.println("successfully deleted!");
					System.out.println(" ");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else if(c==3) {
				//display student
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
					Statement stm = con.createStatement();
					ResultSet rs = stm.executeQuery("select * from student");
					while(rs.next()) {
						System.out.println("id: "+rs.getInt(1)+" "+"name: "+rs.getString(2)+" "+"Email: "+rs.getString(3)+" "+"standard: "+rs.getInt(4)+" "+"Division: "+rs.getString(5));
						System.out.println(" ");
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else if(c==4) {
				//update student
				System.out.println("Enter your id");
				int id = sc.nextInt();
				
				System.out.println("Enter your name");
				String name = sc.next();
				
				System.out.println("Enter your email");
				String email = sc.next();
				
				System.out.println("Enter your standard");
				int std = sc.nextInt();
				
				System.out.println("Enter your division");
				String division = sc.next();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
					//Statement stm = con.createStatement();
					PreparedStatement stm = con.prepareStatement("update student set sname=?,semail=?,s_std=?,sdiv=? where sid=?");
					stm.setInt(5,id);
					stm.setString(1, name);
					stm.setString(2,email);
					stm.setInt(3, std);
					stm.setString(4, division);
					
					stm.executeUpdate();
					System.out.println("successfully updated!");
					System.out.println(" ");
				} catch(Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(c==5) {
				//exit
				break;
			}else {
				
			}
		}
		System.out.println("Thanks for using application!!!");
	}
}
