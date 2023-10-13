package com.hibernate.car.Car;


/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.car.Car.Car;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "programm strated!" );
        Configuration configuration=new Configuration();
        configuration.configure("carhibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Car obj=new Car();
        obj.setModel(700);
        obj.setName("Mahindra");
        obj.setPrice(2500000);
        
        session.save(obj);
        tx.commit();
    }
}
