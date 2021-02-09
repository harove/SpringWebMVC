package com.talento.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/nameForm")
	public String nameForm() {
		return "name-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombre");
		modelo.addAttribute("response", " es la response from form controller ok " + nombre +" ?"  );
		return "response-to-form";
	}	
}
