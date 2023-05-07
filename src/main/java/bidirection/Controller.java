package bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	MacOne m1=new MacOne();
	m1.setMid(123);
	m1.setMname("vaishu");
	m1.setMphone(123456);
	
	Cus c1=new Cus();
	c1.setCid(123);
	c1.setCname("vaishu");
	c1.setPhone(1234561);
	
	Cus c2=new Cus();
	c2.setCid(124);
	c2.setCname("vaishu1");
	c2.setPhone(1234561);
	
	Cus c3=new Cus();
	c3.setCid(125);
	c1.setCname("vaishu2");
	c1.setPhone(1234562);

	List<Cus> ll1=new ArrayList<Cus>();
	
	ll1.add(c1);
	ll1.add(c2);
	ll1.add(c3);
	//mapping
	m1.setC1(ll1);
	c1.setIi(m1);
	c2.setIi(m1);
	c3.setIi(m1);
	
	entityTransaction.begin();
	entityManager.persist(m1);
	entityManager.persist(c1);
	entityManager.persist(c2);
	entityManager.persist(c3);
	entityTransaction.commit();
	
	System.out.println("Bidirection done");
	
	
}
}