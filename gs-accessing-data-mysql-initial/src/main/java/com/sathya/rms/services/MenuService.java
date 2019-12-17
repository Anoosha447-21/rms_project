package com.sathya.rms.services;

import com.sathya.rms.entities.Menu;

public interface MenuService {

	public Menu addMenu(Menu menu);

	public Iterable<Menu> getAllMenus();

	public Menu updateMenus(Menu menu);

	public void deleteMenu(Integer id);

}
