package welcome;

import java.util.Scanner;

public class hello implements register {
	static Scanner s=new Scanner(System.in);
	@Override
	public void insert() {
		
		
	}

	@Override
	public void view() {
		
		
	}

	@Override
	public void edit() {
		
	}

	@Override
	public void update(int id, String depart) {
		
	}

	

	@Override
	public void search(int id, String nam) {
		
		String name;
		System.out.println("enter your name");
		name=s.next();
	}
	public void feedback() {
		String fb;
		System.out.print("Write your feedback here");
		fb=s.next();
		if(fb!=null)
		{
		System.out.println("thank you for your feedback: "+fb);
		}
		else
			System.out.println("your feedback is invalid");
	}
	
	public static void main(String args[])
	{
		hello xy=new hello();
		int choice;
System.out.println("---------------Welcome to Student Registration--------");
System.out.println("---------------select yoour choice--------");
System.out.println("---------------select 1 register--------");
System.out.println("---------------select 2 view--------");
System.out.println("---------------select 3 search--------");
System.out.println("---------------select 4 delete--------");
System.out.println("---------------select 5 update--------");
System.out.println("...............select 6 feedback......");
System.out.println("enter your choice"); 

choice=s.nextInt();
switch(choice)
{
case 1:
	xy.insert();
	break;
case 2 :
	xy.view();
	break;
case 3:
	xy.search(choice, null);
	break;
case 4:
	xy.edit();
	break;
case 5:
	xy.update(choice, null);
case 6:
	xy.feedback();
default:
	System.out.println("incorrect choice");
}
	}
}

