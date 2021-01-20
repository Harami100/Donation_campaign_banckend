package com.app.donation_campaign.subcategory.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.subcategory.dao.SubCategoryRepository;
import com.app.donation_campaign.subcategory.entity.SubCategory;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
	private SubCategoryRepository subCategoryRepository;

	@Autowired
	public SubCategoryServiceImpl(SubCategoryRepository theSubCategoryRepository)
	{
		subCategoryRepository=theSubCategoryRepository;
	}
	
	@Override
	@Transactional
	public List<SubCategory> findAll() {
		// TODO Auto-generated method stub
		return subCategoryRepository.findAll();
	}

	@Override
	public SubCategory findById(int theSubCategoryId) {
		// TODO Auto-generated method stub
		Optional<SubCategory> result=subCategoryRepository.findById(theSubCategoryId);
		
		SubCategory theSubCategory=null;
		
		if(result.isPresent())
		{
			theSubCategory=result.get();
		}
		else
		{
			//we didn't find Category
			throw new RuntimeException("Did not find category id="+theSubCategory);
		}
		return theSubCategory;
	}

	@Override
	public void save(SubCategory theSubCategory) {
		// TODO Auto-generated method stub
		subCategoryRepository.save(theSubCategory);
	}

	@Override
	public void deleteById(int theSubCategoryId) {
		// TODO Auto-generated method stub
		subCategoryRepository.deleteById(theSubCategoryId);
	}

	@Override
	public long findCountOfSubCategory() {
		// TODO Auto-generated method stub
		return subCategoryRepository.count();
	}


}
