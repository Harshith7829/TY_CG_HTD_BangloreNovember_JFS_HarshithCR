package com.capgemini.retailer_db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.retailer_db.dto.Product;
import com.capgemini.retailer_db.dto.User;
import com.capgemini.retailer_db.exception.ProductException;
import com.capgemini.retailer_db.exception.UserException;
@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User auth(String email, String pass) {
		EntityManager manager=	factory.createEntityManager();
		String jpql = "from User where email=:email";
		TypedQuery<User> query = manager.createQuery(jpql,User.class);
		query.setParameter("email", email);
		//query.setParameter("password", pass);
		try {
			User bean=query.getSingleResult();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if(encoder.matches(pass, bean.getPassword())) {
				return bean;
			}else {
				throw new UserException("Password invalid ");
			}
		}catch (Exception e) {
			throw new UserException("Invalid Credentials");
		}	

	}

	@Override
	public boolean register(User bean) {

		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new UserException("Email alrdy exists");
		}
	}


	@Override
	public List<User> getAllUsers() {
		String jpql= "from User";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		List<User> list=query.getResultList();
		if(list!=null) {
			return list;
		}else {
			throw new UserException("Currently no Users are Available");
		}
	}


	@Override
	public boolean changeUserPassword(int id, String pass) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		User bean= manager.find(User.class, id);
		bean.setPassword(pass);
		transaction.commit();
		return true;

	}

	@Override
	public boolean deleteUser(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		User bean=manager.find(User.class, id);
		if(bean!= null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new UserException("Employee Not Found");
	}

	@Override
	public List<User> getUser(int id) {
		String jpql= "from User where userid=:UserId ";
		EntityManager manger = factory.createEntityManager();
		TypedQuery<User> query=manger.createQuery(jpql, User.class);
		query.setParameter("UserId", id);
		return query.getResultList();
	}


}
