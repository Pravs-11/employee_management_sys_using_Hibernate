package com.empmgm;
import java.util.List;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        //employee e1=new employee();
        //e1.setEmpid(2);
        //e1.setEmpName("Pavithra");
        //e1.setEmpLocation("hyd");
       // e1.setEmpProject("react");
        Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
        SessionFactory sf=con.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
       // ses.save(e1);
      
        
        employee e2=new employee();
        
      //used  to retrive the data of user only for primary key data
        //e2= ses.get(employee.class,1);
        
        
      //used to retrive the user data of which is not a primary key
    	//String city="hyd";
    	//e2=(employee)ses.createQuery("from employee where empLocation=:city")
    			//.setParameter("city", city).uniqueResult();
    	
    	//used to show all the details in the data present
        Query qu=ses.createQuery("from employee");
    	
    	List<employee> li=qu.list();
    	
    	for(employee e:li)
   			System.out.println(e.getEmpid()+" : "+e.getEmpName()+" : "+e.getEmpLocation());
    	
        
        //used to update the data
        //Query q=ses.createQuery("update employee set empLocation=:location where empId=:id")
    			//.setParameter("location","pune").setParameter("id",2);
   	//int status=q.executeUpdate();
    	//System.out.println(status);
        
        
        //used to delete the data
       // Query qu=ses.createQuery("delete from employee where empId=:id").setParameter("id",2);

    	//System.out.println(qu.executeUpdate());
        tx.commit();
        //System.out.println(e2);
    }
   
}
