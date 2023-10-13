package com.hibernate.employee.Emp;


/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.employee.Emp.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "programm strated!" );
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Employee obj=new Employee();
        obj.setId(123);
        obj.setName("darshan");
        obj.setAge(22);
        
        session.save(obj);
        tx.commit();
    }
}
