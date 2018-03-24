package org.spring_mvc_1.controller;

import org.spring_mvc_1.dao.ProdutoDAO;
import org.spring_mvc_1.model.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("/home")
	public String index(){
		System.out.println("Out");
		ProdutoModel produto = new ProdutoModel();
		produtoDAO.grava(produto);
		return "home";
	}
}
