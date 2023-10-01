package com.jsp.account.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave { 
	public static void main(String[] args) { 
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction(); 
	    
		
	    BankAccount bankAccount1=new BankAccount();
	    bankAccount1.setBank_name("HDFC");
	    bankAccount1.setIfsc_code("HDBC12345678");
	    bankAccount1.setAcc_no(8765678905357l);
	    
	    BankAccount bankAccount2=new BankAccount();
	    bankAccount2.setBank_name("SBI");
	    bankAccount2.setIfsc_code("SBI23647899");
	    bankAccount2.setAcc_no(578843908658l);
	    
	    BankAccount bankAccount3=new BankAccount();
	    bankAccount3.setBank_name("CANARA");
	    bankAccount3.setIfsc_code("CAN56747899");
	    bankAccount3.setAcc_no(5799438954356l); 
	    
	    Person person=new Person();
		person.setName("sabaat");
	    person.setEmail("sabaat@mail.com");
	    person.setCno(9876677888888l);
	    person.setGender("female"); 
	    
	    bankAccount1.setPerson(person); 
	    bankAccount2.setPerson(person); 
	    bankAccount3.setPerson(person);
	  
	     
	     entityTransaction.begin();
	     entityManager.persist(person);
	     entityManager.persist(bankAccount1);
	     entityManager.persist(bankAccount2);
	     entityManager.persist(bankAccount3);
	     entityTransaction.commit();
	}

}
