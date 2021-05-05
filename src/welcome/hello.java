package welcome;

import java.util.Scanner;

public class hello implements register {
	static Scanner s=new Scanner(System.in);
	@Override
	public void insert() {
		String name;
		System.out.println("enter your name");
		name=s.next();
		
	}

	@Override
	public void delete() {
		String name;
		System.out.println("enter your name");
		name=s.next();	
		
	}

	@Override
	public void edit() {
		String name;
		System.out.println("enter your name");
		name=s.next();
		
	}

	

	@Override
	public void search(int id, String nam) {
		
		String name;
		System.out.println("enter your name");
		name=s.next();
	}
	
	public static void main(String args[])
	{
		hello xy=new hello();
		int choice;
System.out.println("---------------Welcome to Employee Recruiting System--------");
System.out.println("---------------select yoour choice--------");
System.out.println("---------------select 1 register--------");
System.out.println("---------------select 2 search--------");
System.out.println("---------------select 3 update--------");
System.out.println("---------------select 4 delete--------");
System.out.println("enter your choice"); 

choice=s.nextInt();
switch(choice)
{
case 1:
	xy.insert();
	break;
case 2 :
	xy.delete();
	break;
case 3:
	xy.search(choice, null);
	break;
case 4:
	xy.edit();
	break;
default:
	System.out.println("incorrect choice");
}
	}
}
