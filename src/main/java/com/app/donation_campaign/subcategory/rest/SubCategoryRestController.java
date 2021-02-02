package com.app.donation_campaign.subcategory.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.donation_campaign.subcategory.entity.SubCategory;
import com.app.donation_campaign.subcategory.service.SubCategoryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")

public class SubCategoryRestController {
private SubCategoryService subCategoryService;
	
	@Autowired
	public SubCategoryRestController(SubCategoryService theSubCategoryService)
	{
		subCategoryService=theSubCategoryService;
	}
	
	@GetMapping("/subcategories")
	public List<SubCategory> findAll() {
		return subCategoryService.findAll();
	}
	
	@GetMapping("/subcategories/{subcategoryId}")
	public SubCategory getSubCategory(@PathVariable int subCategoryId) {
		
		SubCategory theSubCategory = subCategoryService.findById(subCategoryId);
		
		if (theSubCategory == null) {
			throw new RuntimeException("Sub-Category not found - " + subCategoryId);
		}
		
		return theSubCategory;
	}
	
	@PostMapping("/subcategories")
	public SubCategory addSubCategory(@RequestBody SubCategory theSubCategory) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theSubCategory.setSubcategory_id(0);
		
		subCategoryService.save(theSubCategory);
		
		return theSubCategory;
	}
	
	// add mapping for PUT /subcategories- update existing subcategory
	
	@PutMapping("/subcategories")
	public SubCategory updateSubCategory(@RequestBody SubCategory theSubCategory) {
		
		subCategoryService.save(theSubCategory);
				
		return theSubCategory;
	}
	
	@DeleteMapping("/subcategories/{subcategoryId}")
	public String deleteSubCategory(@PathVariable int subCategoryId) {
		
		SubCategory tempSubCategory = subCategoryService.findById(subCategoryId);
		
		// throw exception if null
		
		if (tempSubCategory == null) {
			throw new RuntimeException("Category id not found - " + subCategoryId);
		}
		
		subCategoryService.deleteById(subCategoryId);
		
		return "Deleted sub-category id - " + subCategoryId;
	}

	@GetMapping("/totalNumberOfSubCategory")
	public long findTotalNumberOfSubCategory() {
		return subCategoryService.findCountOfSubCategory();
	}
}
