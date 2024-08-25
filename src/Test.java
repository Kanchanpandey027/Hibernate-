import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Myuser;



public class Test {

	
	public static void main(String[]args){
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hiber.cfg.xml");
		
		Scanner sc=new Scanner(System.in);
		SessionFactory  factory =cfg.buildSessionFactory();
		Session ss = factory.openSession();
		
		Transaction tx = ss .beginTransaction();
		
		//System.out.println("enter user id:");
		//int uid=Integer.parseInt(sc.nextLine());
		
		System.out.println("eneter user name:");
		String uname=sc.nextLine();
		System.out.println("enter user pass");
		String upass=sc.nextLine();
		
		Myuser u=new Myuser(uname,upass);
		
		ss.save(u);
		tx.commit();
		
		ss.close();
		
		System.out.println("data is inserted");
	
	}
}
