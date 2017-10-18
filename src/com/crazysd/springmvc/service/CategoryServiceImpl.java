package com.crazysd.springmvc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crazysd.springmvc.dao.CategoryDao;
import com.crazysd.springmvc.model.Category;


@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao dao;

	public Category findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public Category findByName(String name) {
		// TODO Auto-generated method stub
		Category category = dao.findByName(name);
		return category;
	}

	public void save(Category category) {
		// TODO Auto-generated method stub
		
	}

	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		dao.save(category);		
	}

	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		Category entity = dao.findById(category.getId_category());
		if(entity!=null){
			entity.setCategory_name(category.getCategory_name());
			entity.setCategory_logo_src(category.getCategory_logo_src());
		}
		
	}

	public void deleteCategoryByName(String name) {
		// TODO Auto-generated method stub
		dao.deleteByName(name);		
	}

	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return dao.findAllCategories();
	}

	public Map<Category, Integer> findCategoryCount() {
		// TODO Auto-generated method stub
		return dao.findCategoryCount();
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}
	
/*
	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findBySSO(String sso) {
		User user = dao.findBySSO(sso);
		return user;
	}

	public void saveUser(User user) {
		dao.save(user);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
/*	public void updateUser(User user) {
		User entity = dao.findById(user.getId());
		if(entity!=null){
			entity.setSsoId(user.getSsoId());
			entity.setPassword(user.getPassword());
			entity.setFirstName(user.getFirstName());
			entity.setLastName(user.getLastName());
			entity.setEmail(user.getEmail());
			entity.setUserProfiles(user.getUserProfiles());
		}
	}

	
	public void deleteUserBySSO(String sso) {
		dao.deleteBySSO(sso);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public boolean isUserSSOUnique(Integer id, String sso) {
		User user = findBySSO(sso);
		return ( user == null || ((id != null) && (user.getId() == id)));
	}
*/	
}
