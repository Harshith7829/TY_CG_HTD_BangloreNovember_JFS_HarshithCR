package com.capgemini.retailer_db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer_db.dto.Product;
import com.capgemini.retailer_db.dto.User;
import com.capgemini.retailer_db.exception.ProductException;
import com.capgemini.retailer_db.exception.UserException;
@Repository
public class ProductDaoImpl implements ProductDao{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(bean);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new ProductException("Id alrdy exists");
		}
	}

	@Override
	public List<Product> getAllProducts() {
		String jpql= "from Product ";
		EntityManager manger = factory.createEntityManager();
		TypedQuery<Product> query=manger.createQuery(jpql, Product.class);
		return query.getResultList();
	
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		User bean=manager.find(User.class, id);
		if(bean!= null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new ProductException("Currently no products are Avialable");
	}
	

	@Override
	public List<Product> getProduct(int id) {
		String jpql= "from Product";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		List<Product> list=query.getResultList();
		if(list!=null) {
			return list;
		}else {
			throw new ProductException("No such product found with entered id");
		}
	}

    
	
	

	
}
