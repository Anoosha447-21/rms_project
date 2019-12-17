package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.ShiftType;
import com.sathya.rms.services.ShiftTypeService;



@RestController
public class ShiftTypeController {
	@Autowired
	ShiftTypeService shifttypeservice;
	@PostMapping(path="/insertShiftType")
	public ShiftType addShiftType(@RequestBody ShiftType shifttype) 
	{
	return shifttypeservice.addShiftType(shifttype);
	
	}
	@PutMapping(path="/updateShiftType")
	public ShiftType updateShiftType(@RequestBody ShiftType shifttype)
	{
	return shifttypeservice.updateShiftType(shifttype);
	}
	@DeleteMapping(path="/deleteShiftType/{id}")
	void deleteShiftType(@PathVariable("id") Integer id) {
		shifttypeservice.deleteShiftType(id);
		
	}
	@GetMapping(path="/getAllShiftTypes")
	public Iterable<ShiftType> getAllShiftTypes(){
		return shifttypeservice.getAllShiftTypes();
		
	}
	
}
