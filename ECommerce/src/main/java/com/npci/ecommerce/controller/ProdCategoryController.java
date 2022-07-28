package com.npci.ecommerce.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.npci.ecommerce.entity.ProductCategory;
import com.npci.ecommerce.service.ProductCategoryService;

@Controller
@RequestMapping("/category")
public class ProdCategoryController {

	@Autowired
	ProductCategoryService catServ;
	
	@GetMapping("/list")
	public String displayCategorys(Model model){
		List<ProductCategory> cat = catServ.findAll();
		model.addAttribute("PRODUCTCATEGORY",cat);
		return "productUi/category.html";
		
	}

	@GetMapping("/addCategory")
	public String empForm(Model model) {
		model.addAttribute("PRODUCTCATEGORY",new ProductCategory());
		return "productUi/catform.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCTCATEGORY") ProductCategory cat) {
		catServ.save(cat);
		return "redirect:/category/list";
	}
	
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("id") long id, Model model) {
		ProductCategory cat = catServ.findById(id);
		model.addAttribute("PRODUCT",cat);
		return "productUi/catForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("categoryId") long id) {
		catServ.deleteById(id);
		
		return "redirect:/category/list";
	}
	

	@GetMapping("/byid")
	public String displayCategoryGroup(@RequestParam("id") long id, Model model){
		ProductCategory cat = catServ.findById(id);
		model.addAttribute("PRODUCTCATEGORY",cat);
		return "productUi/category.html";

}
}
