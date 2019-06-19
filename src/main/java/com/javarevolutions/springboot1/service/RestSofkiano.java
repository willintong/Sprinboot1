package com.javarevolutions.springboot1.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javarevolutions.springboot1.vo.VOSofkiano;

@RestController
@RequestMapping(path = "/servicesREST/Sofka")
public class RestSofkiano {

	@RequestMapping(method = RequestMethod.POST, 
			path = "/validateUserSofka", 
			consumes = "application/json", 
			produces = "application/json")
	public @ResponseBody VOSofkiano validateUser(@RequestBody VOSofkiano user) throws Exception {
		VOSofkiano response = new VOSofkiano();
		response.setFind(false);
		System.out.println("User: " + user.getUser());
		System.out.println("Password: " + user.getPassword());
		System.out.println("Proyecto: " + user.getProyecto());
		System.out.println("Dirección: " + user.getDireccion());
		
		try {
			if (user.getUser().equals("Willintong")  && user.getPassword().equals("Sofka123") && user.getProyecto().equals("Sura") && user.getDireccion().equals("calle 2")) {
				response.setUser(user.getUser());
				response.setFind(true);
			}
			return response;
		} catch (Exception ex) {

			return response;
		}
	}
}
