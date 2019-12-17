package com.sathya.rms.services;

import com.sathya.rms.entities.ShiftType;


public interface ShiftTypeService {
	
	ShiftType addShiftType(ShiftType shifttype);
	ShiftType updateShiftType(ShiftType shifttype);
	void deleteShiftType(Integer id);
	Iterable<ShiftType> getAllShiftTypes();

}
