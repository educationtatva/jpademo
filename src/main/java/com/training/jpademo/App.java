package com.training.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
        EntityManager em = emf.createEntityManager();
        
        Person p = em.find(Person.class, 101);
        
        System.out.println("p.id "+p.getPid()+" and "+p.getName()+" "+p.getHobby());
    }
}
