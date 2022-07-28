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

import com.npci.ecommerce.entity.Product;
import com.npci.ecommerce.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService prodServ;
	
	@GetMapping("/list")
	public String displayProducts(Model model){
		List<Product> prod = prodServ.findAll();
		model.addAttribute("PRODUCT",prod);
		return "productUi/product.html";
		
	}

	@GetMapping("/addProduct")
	public String empForm(Model model) {
		model.addAttribute("PRODUCT",new Product());
		return "productUi/productForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT") Product product) {
		prodServ.save(product);
		return "redirect:/products/list";
	}
	
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("id") Integer id, Model model) {
		Product prod = prodServ.findById(id);
		model.addAttribute("PRODUCT",prod);
		return "productUi/productForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("id") Integer id) {
		prodServ.deleteById(id);
		
		return "redirect:/products/list";
	}
	
	@GetMapping("/search")
	 public String SeacrhById(@RequestParam("id") Integer id, Model model) {
		Product prod = prodServ.findById(id);
		model.addAttribute("PRODUCT",prod);
		  return "product.html";
		 }
}
