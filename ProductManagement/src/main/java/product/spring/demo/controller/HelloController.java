package product.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import product.spring.demo.model.Product;

@Controller
public class HelloController {

	
	@RequestMapping("/product")
	public ModelAndView hello(){
		ModelAndView m = new ModelAndView("product");
		//m.setViewName("index");
		m.addObject("msg", "Spring hello");
		List<Product> productList = new ArrayList<>();
		Product p = new Product();
		p.setId(1);
		p.setName("Product1");
		p.setPrice("3000");
		productList.add(p);
		m.addObject("allproduct", productList);
		return m;
	}
	
	@RequestMapping("/hello")
	public String index(HttpServletRequest request, HttpServletResponse response){
		
		request.setAttribute("title", "Test request");
		return "hello";
	}
}
