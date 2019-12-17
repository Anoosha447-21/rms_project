package com.sathya.rms.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Menu;
import com.sathya.rms.services.MenuService;


@RestController
public class MenuController {
	@Autowired
	MenuService menuservice;
	
	@PostMapping(path="/addOrder")
	public Menu addMenu(@RequestBody Menu menu) {
		// TODO Auto-generated method stub
		return menuservice.addMenu(menu);
	}
	@GetMapping(path="/getMenus")
	
	public Iterable<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		return menuservice.getAllMenus();
	}
	@Transactional
	
	@PutMapping(path="/updateMenu")
	public Menu updateMenus(@RequestBody Menu menu) {
		// TODO Auto-generated method stub
		return menuservice.updateMenus(menu);
	}
	@Transactional

	@DeleteMapping(path="/deleteMenu/{id}")
	public void deleteMenu(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		menuservice.deleteMenu(id);
	}
}
