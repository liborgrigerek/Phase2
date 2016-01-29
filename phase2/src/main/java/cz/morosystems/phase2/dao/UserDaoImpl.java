package cz.morosystems.phase2.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cz.morosystems.phase2.entity.UserEntity;
import cz.morosystems.phase2.exception.UserNotFoundException;

@Repository
public class UserDaoImpl implements UserDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<UserEntity> getAllUsers() {
		return this.sessionFactory.getCurrentSession().createQuery("from UserEntity").list();
	}
	@Transactional
	public UserEntity getUser(Integer id) {
		UserEntity user = (UserEntity) this.sessionFactory.getCurrentSession().createQuery("from UserEntity user where user.id = :id").setParameter("id", id).uniqueResult();
		return user;
	}
}
