package com.capgemini.retailer_db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer_db.dto.Order;
import com.capgemini.retailer_db.dto.User;
import com.capgemini.retailer_db.exception.OrderException;
import com.capgemini.retailer_db.exception.UserException;
@Repository
public class OrderDaoImpl implements OrderDao{


	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addOrder(Order bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new OrderException("Out of stock");
		}
	}

	@Override
	public List<Order> getAllOrders() {
		String jpql= "from Order ";
		EntityManager manger = factory.createEntityManager();
		TypedQuery<Order> query=manger.createQuery(jpql, Order.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteOrder(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		User bean=manager.find(User.class, id);
		if(bean!= null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new OrderException("No Such Prouduct found");
	
	}

	@Override
	public List<Order> getOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
