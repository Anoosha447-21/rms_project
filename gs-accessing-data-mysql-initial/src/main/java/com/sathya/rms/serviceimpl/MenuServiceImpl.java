package com.sathya.rms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.MenuRepository;
import com.sathya.rms.entities.Menu;
import com.sathya.rms.services.MenuService;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	MenuRepository menurepository;

	@Override
	public Menu addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menurepository.save(menu);	}

	@Override
	public Iterable<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		return menurepository.findAll();
	}

	@Override
	public Menu updateMenus(Menu menu) {
		// TODO Auto-generated method stub
		return menurepository.save(menu);
	}

	@Override
	public void deleteMenu(Integer id) {
		// TODO Auto-generated method stub
		menurepository.deleteById(id);
	}
	
		
	

}
