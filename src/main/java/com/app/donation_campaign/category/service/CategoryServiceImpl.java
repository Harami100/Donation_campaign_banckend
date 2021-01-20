package com.app.donation_campaign.category.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.category.dao.CategoryRepository;
import com.app.donation_campaign.category.entity.Category;


@Service
public class CategoryServiceImpl implements CategoryService {
	private CategoryRepository categoryRepository;

	@Autowired
	public CategoryServiceImpl(CategoryRepository theCategoryRepository)
	{
		categoryRepository=theCategoryRepository;
	}
	
	@Override
	@Transactional
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(int theCategoryId) {
		// TODO Auto-generated method stub
		Optional<Category> result=categoryRepository.findById(theCategoryId);
		
		Category theCategory=null;
		
		if(result.isPresent())
		{
			theCategory=result.get();
		}
		else
		{
			//we didn't find Category
			throw new RuntimeException("Did not find category id="+theCategory);
		}
		return theCategory;
	}

	@Override
	public void save(Category theCategory) {
		// TODO Auto-generated method stub
		categoryRepository.save(theCategory);
	}

	@Override
	public void deleteById(int theCategoryId) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(theCategoryId);
	}

	@Override
	public long findCountOfCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.count();
	}

	

}
