package org.soo.web;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.soo.domain.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController3 {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doD(Model model) {

		ProductVO product = new ProductVO("Sample Product", 10000);
		
		logger.info("================  doD called  ================  ");
		
		model.addAttribute(product);
		
		return "productDetail";
	}
}
